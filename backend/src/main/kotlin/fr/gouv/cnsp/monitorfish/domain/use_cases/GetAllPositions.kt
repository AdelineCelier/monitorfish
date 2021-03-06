package fr.gouv.cnsp.monitorfish.domain.use_cases

import fr.gouv.cnsp.monitorfish.config.UseCase
import fr.gouv.cnsp.monitorfish.domain.entities.Position
import fr.gouv.cnsp.monitorfish.domain.repositories.PositionsRepository

@UseCase
class GetAllPositions(private val sensorRepository: PositionsRepository) {

    fun execute(): List<Position> {
        return sensorRepository.findAll()
    }
}