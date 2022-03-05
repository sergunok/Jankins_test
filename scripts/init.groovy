pipelineJob('job-dsl-plugin') {
    definition {
        cps {
            script(readFileFromWorkspace('test.Jenkinsfile'))
        }
    }
}
