package se.mdh.idt.benji.examples.models20.ecore

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory

import static se.mdh.idt.benji.difference.api.DifferenceFactory.difference

class Differences {
	
	static extension EcoreFactory = EcoreFactory.eINSTANCE
	
	public static val moveElement = difference
		.name("Move Element")
		.precondition(MoveElementPrecondition.instance)
		.action[
			val eSubPackage = createEPackage
			eSubPackage.name = "shop"
			eSubPackage.EClassifiers += EClass.current as EClass
			(EPackage.current as EPackage).ESubpackages += eSubPackage
		]
		.postcondition(MoveElementPostcondition.instance)
		.build
		
	public static val renameElement = difference
		.name("Rename Element")
		.precondition(RenameElementPrecondition.instance)
		.action[
			(EClass.current as EClass).name = "Pet"
			(EAttribute.current as EAttribute).name = "moniker"
		]
		.postcondition(RenameElementPostcondition.instance)
		.build
		
	public static val moveRenamedElement = difference
		.name("Move Renamed Element")
		.precondition(MoveRenamedElementPrecondition.instance)
		.action[
			(EClass.current as EClass).name = "Pet"
			(EAttribute.current as EAttribute).name = "moniker"
			val eSubPackage = createEPackage
			eSubPackage.name = "shop"
			eSubPackage.EClassifiers += EClass.current as EClass
			(EPackage.current as EPackage).ESubpackages += eSubPackage
		]
		.postcondition(MoveRenamedElementPostcondition.instance)
		.build
		
	public static val exchangeLocationOfElements = difference
		.name("Exchange Location of Elements")
		.precondition(ExchangeLocationOfElementsPrecondition.instance)
		.action[
			(ELeftPackage.current as EPackage).EClassifiers += ERightClass.current as EClass
			(ERightPackage.current as EPackage).EClassifiers += ELeftClass.current as EClass
		]
		.postcondition(ExchangeLocationOfElementsPostcondition.instance)
		.build
	
	public static val updateReferenceTarget = difference
		.name("Update Reference Target")
		.precondition(UpdateReferenceTargetPrecondition.instance)
		.action[
			(EReference.current as se.mdh.idt.benji.examples.metamodels.ecore.Reference).type 
			= (ETargetReferenceType.current as se.mdh.idt.benji.examples.metamodels.ecore.Class)
		]
		.postcondition(UpdateReferenceTargetPostcondition.instance)
		.build
		
		
}