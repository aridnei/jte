pipeline_template = "pipeline1.groovy"

parameters {
    environment = "prod"
}

application_environments{
    dev{
        release = "XXXXX"
    }
    sit{
        release = "YYYYY"
    }
    prod{
        release = "ZZZZZ"
    }
}
