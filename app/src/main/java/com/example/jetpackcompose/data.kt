package com.example.jetpackcompose

data class Course(
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
)

val courseList = listOf(
    Course(
        title = "Web Development",
        code = "CS101",
        creditHours = 3,
        description = "This course provides a foundational understanding of Web Development concepts...",
        prerequisites = "None"
    ),
    Course(
        title = "Data Structures and Algorithms",
        code = "CS201",
        creditHours = 4,
        description = "This course covers fundamental data structures and algorithms...",
        prerequisites = "CS101"
    ),
    Course(
        title = "Operating System",
        code = "SC101",
        creditHours = 4,
        description = "An introductory course to differential calculus...",
        prerequisites = "Computer Architecture"
    ),
    Course(
        title = "Mobile App",
        code = "CS342",
        creditHours = 3,
        description = "This course introduces the concepts of vectors, matrices, and linear transformations...",
        prerequisites = "Web Development"
    ),
    Course(
        title = "Object-Oriented Programming",
        code = "CS202",
        creditHours = 3,
        description = "Covers the principles of object-oriented programming including classes, inheritance, polymorphism, and design principles using Java.",
        prerequisites = "CS101"
),

    Course(
        title = "Software Engineering Principles",
        code = "SE301",
        creditHours = 3,
        description = "Introduces software development life cycles, requirement analysis, design, implementation, testing, and maintenance.",
        prerequisites = "CS201"
    ),
    Course(
        title = "Cybersecurity Fundamentals",
        code = "CS402",
        creditHours = 3,
        description = "Explores core cybersecurity principles, cryptography, network security, and ethical hacking basics.",
        prerequisites = "CS305"
    ),
    Course(
        title = "Computer Networks",
        code = "CS305",
        creditHours = 3,
        description = "Introduces the fundamentals of computer networking including OSI model, TCP/IP, routing, and network security.",
        prerequisites = "CS201"
    ),
    Course(
        title = "Artificial Intelligence",
        code = "CS403",
        creditHours = 3,
        description = "Introduces AI concepts including search algorithms, knowledge representation, and machine learning basics.",
        prerequisites = "CS201"
    ),


    )
