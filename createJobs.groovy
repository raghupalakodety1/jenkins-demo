pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('assecor-backend-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://gitlab.com/raghu.palakodety/assecor-backend.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}