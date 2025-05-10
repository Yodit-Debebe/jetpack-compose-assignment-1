package com.example.jetpackcompose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CourseItem(course: Course) {
    var isExpanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .animateContentSize(animationSpec = tween(durationMillis = 400)),
              elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
                .fillMaxWidth()
                .clickable { isExpanded = !isExpanded }
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = course.title, color = MaterialTheme.colorScheme.primary, style = MaterialTheme.typography.headlineSmall, modifier = Modifier.weight(1f), fontWeight = FontWeight.Bold)
                IconButton(onClick = { isExpanded = !isExpanded }) {
                    Text(if (isExpanded) "Less" else "More")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Code: ${course.code}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Credits: ${course.creditHours}", style = MaterialTheme.typography.bodyMedium)

            AnimatedVisibility(visible = isExpanded) {
                Column(modifier = Modifier.padding(top = 8.dp)) {
                    HorizontalDivider()
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Description:", style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.Bold)
                    Text(text = course.description, style = MaterialTheme.typography.bodyMedium)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Prerequisites:", style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.Bold)
                    Text(text = course.prerequisites, style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}

@Composable
fun CourseList(courses: List<Course>) {
    LazyColumn(
        contentPadding = PaddingValues(all = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(courses) { course ->
            CourseItem(course = course)
        }
    }
}


