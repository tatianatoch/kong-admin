package com.example.kong.controller

import java.util.Set
import java.util.UUID
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KongServiceController(
//    private val serviceApi: ServiceApi
    ) {

/*    @GetMapping("/services/{name}")
    fun serviceByName(@PathVariable name: String?): ServiceResponse? {
        return serviceApi.retrieve(name)
    }

    @GetMapping("/services-by-tag/{name}")
    fun servicesByTag(@PathVariable name: String?): List<ServiceResponse?>? {
        return serviceApi.findByTag(TagQueryBuilder().addTag(name)).getData()
    }

    @PostMapping("/services/{name}")
    fun addService(@PathVariable name: String?): ServiceResponse? {
        val serviceRequest = ServiceRequest()
        serviceRequest.setName(String.format("mock_service_for_delete_%s", UUID.randomUUID()))
        //        serviceRequest.setName("mock_service_for_delete");
        serviceRequest.setRetries(7)
        serviceRequest.setProtocol(ProtocolEnum.HTTPS)
        serviceRequest.setTags(Set.of("mock_service", "check_kong_library"))
        serviceRequest.setHost("mockserver-qa.platform-qa")
        serviceRequest.setPort(1080)
        serviceRequest.setPath("/test/service/route/4")
        //        serviceRequest.setTags(Set.of("mock_service"));
        serviceRequest.setConnectTimeout(60000)
        serviceRequest.setWriteTimeOut(60000)
        serviceRequest.setReadTimeout(60000)
        serviceRequest.setClientCertificate(null)
        return serviceApi.add(serviceRequest)
    }

    //изменяется только та часть, которая передаётся, не переданные поля остаются прежними
    @PutMapping("/services/{name}")
    fun updateService(@PathVariable name: String?): ServiceResponse? {
        val serviceRequest = ServiceRequest()
        //        serviceRequest.setName("mock_service_02ceea944c078fa48bc87957c52aaf71");
        serviceRequest.setRetries(7)
        serviceRequest.setProtocol(ProtocolEnum.HTTPS)
        serviceRequest.setConnectTimeout(60000)
        *//*        serviceRequest.setHost("mockserver-qa.platform-qa");
        serviceRequest.setPort(1080);
        serviceRequest.setPath("/test/service/route/3");
        serviceRequest.setTags(Set.of("mock_service"));
        serviceRequest.setWriteTimeOut(60000);
        serviceRequest.setReadTimeout(60000);
        serviceRequest.setClientCertificate(null);*//*
        return serviceApi.update(name, serviceRequest)
    }

    @DeleteMapping("/services/{name}")
    fun deleteService(@PathVariable name: String?): ResponseEntity<Void?>? {
        serviceApi.delete(name)
        return ResponseEntity.noContent().build()
    }*/
}