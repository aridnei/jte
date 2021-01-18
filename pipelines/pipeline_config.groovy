// maven app: pipeline_config.groovy
allow_scm_jenkinsfile = false

libraries {
    merge = true
    maven
    deploy
}

environment='dev'
parameters {
    environment = "dev"
}

stages{
    prepare_package{
        build
    }
}

application_environments{
    dev{
        merge = true
    	short_name = "dev"
        long_name = "Development"
    }
    sit{
        merge = true
        short_name = "sit"
        long_name = "Stage"
    }
    prod{
        merge = true
        short_name = "prod"
        long_name = "Production"
    }
}
