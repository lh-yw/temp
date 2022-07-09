package com.github.lhyw.temp.services

import com.intellij.openapi.project.Project
import com.github.lhyw.temp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
