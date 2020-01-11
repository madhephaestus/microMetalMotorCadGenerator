import eu.mihosoft.vrl.v3d.parametrics.*;
CSG generate(){
	String type= "microMetalMotor"
	if(args==null)
		args=["298_to_one_3079"]
	// The variable that stores the current size of this vitamin
	StringParameter size = new StringParameter(	type+" Default",args.get(0),Vitamins.listVitaminSizes(type))
	HashMap<String,Object> measurments = Vitamins.getConfiguration( type,size.getStrValue())

	def MaxTorqueNewtonmetersValue = measurments.MaxTorqueNewtonmeters
	def zDimentionValue = measurments.zDimention
	def massCentroidYValue = measurments.massCentroidY
	def yDimentionValue = measurments.yDimention
	def massCentroidXValue = measurments.massCentroidX
	def boltSizeValue = measurments.boltSize
	def sourceValue = measurments.source
	def massCentroidZValue = measurments.massCentroidZ
	def encoderValue = measurments.encoder
	def xEncoderValue = measurments.xEncoder
	def priceValue = measurments.price
	def xDimentionValue = measurments.xDimention
	def boltDistanceFromShaftValue = measurments.boltDistanceFromShaft
	def shaftSizeValue = measurments.shaftSize
	def shaftTypeValue = measurments.shaftType
	def MaxFreeSpeedRadPerSecValue = measurments.MaxFreeSpeedRadPerSec
	def yEncoderValue = measurments.yEncoder
	def zEncoderValue = measurments.zEncoder
	def massKgValue = measurments.massKg
	println "Measurment MaxTorqueNewtonmetersValue =  "+MaxTorqueNewtonmetersValue
	println "Measurment zDimentionValue =  "+zDimentionValue
	println "Measurment massCentroidYValue =  "+massCentroidYValue
	println "Measurment yDimentionValue =  "+yDimentionValue
	println "Measurment massCentroidXValue =  "+massCentroidXValue
	println "Measurment boltSizeValue =  "+boltSizeValue
	println "Measurment sourceValue =  "+sourceValue
	println "Measurment massCentroidZValue =  "+massCentroidZValue
	println "Measurment encoderValue =  "+encoderValue
	println "Measurment xEncoderValue =  "+xEncoderValue
	println "Measurment priceValue =  "+priceValue
	println "Measurment xDimentionValue =  "+xDimentionValue
	println "Measurment boltDistanceFromShaftValue =  "+boltDistanceFromShaftValue
	println "Measurment shaftSizeValue =  "+shaftSizeValue
	println "Measurment shaftTypeValue =  "+shaftTypeValue
	println "Measurment MaxFreeSpeedRadPerSecValue =  "+MaxFreeSpeedRadPerSecValue
	println "Measurment yEncoderValue =  "+yEncoderValue
	println "Measurment zEncoderValue =  "+zEncoderValue
	println "Measurment massKgValue =  "+massKgValue
	// Stub of a CAD object
	CSG part = new Cube().toCSG()
	return part
		.setParameter(size)
		.setRegenerate({generate()})
}
return generate() 