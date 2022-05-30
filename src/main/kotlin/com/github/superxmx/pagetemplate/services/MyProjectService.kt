package com.github.superxmx.pagetemplate.services

import com.intellij.openapi.project.Project
import com.github.superxmx.pagetemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
