
class Sensor:
    tipo = "Genérico"

    def __init__(self, id, **kwargs):
        super().__init__(**kwargs)
        self.id = id
        self.encendido = False

    def activar(self):
        self.encendido = True
        print(f"[{self.tipo}] Sensor {self.id} activado")

    def desactivar(self):
        self.encendido = False
        print(f"[{self.tipo}] Sensor {self.id} desactivado")


class Camara(Sensor):
    tipo = "Cámara"

    def __init__(self, id, resolucion, **kwargs):
        super().__init__(id=id, **kwargs)
        self.resolucion = resolucion


class SensorLuzLaser(Sensor):
    tipo = "Luz Laser"

    def __init__(self, id, alcance, **kwargs):
        super().__init__(id=id, **kwargs)
        self.alcance = alcance


class VehiculoAutonomo(Camara, SensorLuzLaser):
    tipo = "Vehículo Autónomo"

    def __init__(self, id, resolucion, alcance):
        super().__init__(id=id, resolucion=resolucion, alcance=alcance)
