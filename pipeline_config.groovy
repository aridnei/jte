jte{
  pipeline_template = "pipeline1.groovy"
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
