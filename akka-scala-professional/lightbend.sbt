resolvers in ThisBuild += "lightbend-commercial-mvn" at
        "https://repo.lightbend.com/pass/iBjX2qNniqNaA_w5IFlmp_Z94FVSSQ4_wjd1-WZto4C1lChj/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
        url("https://repo.lightbend.com/pass/iBjX2qNniqNaA_w5IFlmp_Z94FVSSQ4_wjd1-WZto4C1lChj/commercial-releases"))(Resolver.ivyStylePatterns)
