import javaposse.jobdsl.dsl.Job

pipelineJob('job-dsl-plugin') {
    definition {
        cps {
            script(readFileFromWorkspace('test.Jenkinsfile'))
        }
    }
}

println org.codehaus.groovy.control.ResolveVisitor.DEFAULT_IMPORTS
