package com.example.server

import net.corda.core.identity.Party

data class SampleReqClass(val iouValue: String, val otherParty: Party)
