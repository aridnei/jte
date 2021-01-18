// maven app: pipeline_config.groovy
@merge jte{
    allow_scm_jenkinsfile = false
}
@merge libraries{
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
    @merge dev{
    	short_name = "dev"
        long_name = "Development"
    }
    @merge sit{
        short_name = "sit"
        long_name = "Stage"
    }
    @merge prod{
        short_name = "prod"
        long_name = "Production"
    }
}
