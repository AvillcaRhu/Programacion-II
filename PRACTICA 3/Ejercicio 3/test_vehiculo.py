
from sensores import Sensor, Camara, SensorLuzLaser, VehiculoAutonomo

sensor = Sensor("S-01")
camara = Camara("C-01", "1920x1080")
laser = SensorLuzLaser("L-01", 150)
vehiculo = VehiculoAutonomo("V-01", "3840x2160", 200)

print("Atributos de clase:")
for clase in (Sensor, Camara, SensorLuzLaser, VehiculoAutonomo):
    print(f"  {clase.__name__}.tipo = {clase.tipo}")

print("\nAtributos de instancia de VehiculoAutonomo:")
print(f"  id = {vehiculo.id}")
print(f"  encendido = {vehiculo.encendido}")
print(f"  resolucion = {vehiculo.resolucion}")
print(f"  alcance = {vehiculo.alcance}")

print("\nMetodos heredados:")
vehiculo.activar()
print(f"  encendido = {vehiculo.encendido}")
vehiculo.desactivar()
print(f"  encendido = {vehiculo.encendido}")

print("\nMRO de VehiculoAutonomo:")
print("  " + " -> ".join(c.__name__ for c in VehiculoAutonomo.__mro__))

print("\nisinstance(vehiculo, Camara):", isinstance(vehiculo, Camara))
print("isinstance(vehiculo, SensorLuzLaser):", isinstance(vehiculo, SensorLuzLaser))
print("isinstance(vehiculo, Sensor):", isinstance(vehiculo, Sensor))
