pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('book-inventory-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Egwonor/test.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
