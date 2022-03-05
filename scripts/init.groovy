import javaposse.jobdsl.dsl.Job

pipelineJob('job-dsl-plugin') {
    definition {
        cps {
            script(readFileFromWorkspace('test.Jenkinsfile'))
        }
    }
}
