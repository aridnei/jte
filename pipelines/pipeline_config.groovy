// maven app: pipeline_config.groovy
jte{
    allow_scm_jenkinsfile = false
}
libraries{
    maven
    deploy
}

environment='dev'
parameters {
    environment = "dev"
}

application_environments{
	@merge dev{
    	short_name = "dev"
        long_name = "Development"
    }
    @merge sit{
        short_name = "sit"
        long_name = "Production"
    }
    @merge prod{
        short_name = "prod"
        long_name = "Production"
    }
}
