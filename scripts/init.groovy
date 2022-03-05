import javaposse.jobdsl.dsl.Jobz

pipelineJob('job-dsl-plugin') {
    definition {
        cps {
            script(readFileFromWorkspace('test.Jenkinsfile'))
        }
    }
}
