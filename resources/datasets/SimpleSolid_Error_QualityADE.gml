<?xml version="1.0" encoding="utf-8"?>
<core:CityModel xmlns:core="http://www.opengis.net/citygml/2.0" xmlns:bldg="http://www.opengis.net/citygml/building/2.0"
	xmlns:gml="http://www.opengis.net/gml" xmlns:xlink="http://www.w3.org/1999/xlink"
	xmlns:qual="https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.opengis.net/citygml/building/2.0 http://schemas.opengis.net/citygml/building/2.0/building.xsd http://www.opengis.net/citygml/2.0 http://schemas.opengis.net/citygml/2.0/cityGMLBase.xsd https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4 https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4/qualityAde.xsd">
	
	<!-- Einfaches Gebäude mit Grundriss 3m x 5m und Satteldach, Traufhöhe 3m, Firsthöhe 4,5m Modelliert mit Begrenzungsflächen 
		(eine Dachfläche, 4 Wandflächen, 1 Grundfläche), die Gebäudegeometrie als Solid, der auf die Polygone der Begrenzungsflächen 
		referenziert CityGML 2.0 linear ring _Simple_BD.1_PG.6_LR.1 beinhaltet zwei aufeinander folgende Punkte, die identisch sind. 
		10.5.2017 Author: V. Coors, HFT Stuttgart Lizenz: -->

	<core:cityObjectMember>
		<bldg:Building gml:id="_Simple_BD.1">
			<qual:validationResult>
				<qual:ValidationResult>
					<qual:validationPlanID xlink:href="#idvalue0" />
					<qual:error>
						<qual:GE_R_CONSECUTIVE_POINTS_SAME>
							<qual:linearRingId>_Simple_BD.1_PG.6_LR.1</qual:linearRingId>
							<qual:vertex1>11.5 10.0 4.5</qual:vertex1>
							<qual:vertex2>11.5 10.0 4.5</qual:vertex2>
						</qual:GE_R_CONSECUTIVE_POINTS_SAME>
					</qual:error>
					<qual:resultType>OK</qual:resultType>
				</qual:ValidationResult>
			</qual:validationResult>
			<bldg:lod2Solid>
				<gml:Solid>
					<gml:exterior>
						<gml:CompositeSurface>
							<gml:surfaceMember xlink:href="#_Simple_BD.1_PG.1" />
							<gml:surfaceMember xlink:href="#_Simple_BD.1_PG.2" />
							<gml:surfaceMember xlink:href="#_Simple_BD.1_PG.3" />
							<gml:surfaceMember xlink:href="#_Simple_BD.1_PG.4" />
							<gml:surfaceMember xlink:href="#_Simple_BD.1_PG.5" />
							<gml:surfaceMember xlink:href="#_Simple_BD.1_PG.6" />
							<gml:surfaceMember xlink:href="#_Simple_BD.1_PG.7" />
						</gml:CompositeSurface>
					</gml:exterior>
				</gml:Solid>
			</bldg:lod2Solid>
			<bldg:boundedBy>
				<bldg:WallSurface gml:id="_Simple_BD.1_WallSurface_1">
					<bldg:lod2MultiSurface>
						<gml:MultiSurface>
							<gml:surfaceMember>
								<gml:Polygon gml:id="_Simple_BD.1_PG.2">
									<gml:exterior>
										<gml:LinearRing gml:id="_Simple_BD.1_PG.2_LR.1">
											<gml:posList srsDimension="3">
												13.0 15.0 0.0
												13.0 15.0 3.0
												13.0 10.0 3.0
												13.0 10.0 0.0
												13.0 15.0 0.0
											</gml:posList>
										</gml:LinearRing>
									</gml:exterior>
								</gml:Polygon>
							</gml:surfaceMember>
						</gml:MultiSurface>
					</bldg:lod2MultiSurface>
				</bldg:WallSurface>
			</bldg:boundedBy>
			<bldg:boundedBy>
				<bldg:WallSurface gml:id="_Simple_BD.1_WallSurface_2">
					<bldg:lod2MultiSurface>
						<gml:MultiSurface>
							<gml:surfaceMember>
								<gml:Polygon gml:id="_Simple_BD.1_PG.3">
									<gml:exterior>
										<gml:LinearRing gml:id="_Simple_BD.1_PG.3_LR.1">
											<gml:posList srsDimension="3">
												10.0 15.0 0.0
												10.0 15.0 3.0
												11.5 15.0 4.5
												13.0 15.0 3.0
												13.0 15.0 0.0
												10.0
												15.0 0.0
											</gml:posList>
										</gml:LinearRing>
									</gml:exterior>
								</gml:Polygon>
							</gml:surfaceMember>
						</gml:MultiSurface>
					</bldg:lod2MultiSurface>
				</bldg:WallSurface>
			</bldg:boundedBy>
			<bldg:boundedBy>
				<bldg:WallSurface gml:id="_Simple_BD.1_WallSurface_3">
					<bldg:lod2MultiSurface>
						<gml:MultiSurface>
							<gml:surfaceMember>
								<gml:Polygon gml:id="_Simple_BD.1_PG.4">
									<gml:exterior>
										<gml:LinearRing gml:id="_Simple_BD.1_PG.4_LR.1">
											<gml:posList srsDimension="3">
												10.0 10.0 3.0
												10.0 15.0 3.0
												10.0 15.0 0.0
												10.0 10.0 0.0
												10.0 10.0 3.0
											</gml:posList>
										</gml:LinearRing>
									</gml:exterior>
								</gml:Polygon>
							</gml:surfaceMember>
						</gml:MultiSurface>
					</bldg:lod2MultiSurface>
				</bldg:WallSurface>
			</bldg:boundedBy>
			<bldg:boundedBy>
				<bldg:WallSurface gml:id="_Simple_BD.1_WallSurface_4">
					<bldg:lod2MultiSurface>
						<gml:MultiSurface>
							<gml:surfaceMember>
								<gml:Polygon gml:id="_Simple_BD.1_PG.5">
									<gml:exterior>
										<gml:LinearRing gml:id="_Simple_BD.1_PG.5_LR.1">
											<gml:posList srsDimension="3">
												13.0 10.0 0.0
												13.0 10.0 3.0
												11.5 10.0 4.5
												10.0 10.0 3.0
												10.0 10.0 0.0
												13.0
												10.0 0.0
											</gml:posList>
										</gml:LinearRing>
									</gml:exterior>
								</gml:Polygon>
							</gml:surfaceMember>
						</gml:MultiSurface>
					</bldg:lod2MultiSurface>
				</bldg:WallSurface>
			</bldg:boundedBy>
			<bldg:boundedBy>
				<bldg:RoofSurface gml:id="_Simple_BD.1_RoofSurface_1">
					<bldg:lod2MultiSurface>
						<gml:MultiSurface>
							<gml:surfaceMember>
								<gml:Polygon gml:id="_Simple_BD.1_PG.6">
									<gml:exterior>
										<gml:LinearRing gml:id="_Simple_BD.1_PG.6_LR.1">
											<gml:posList srsDimension="3">
												10.0 10.0 3.0
												11.5 10.0 4.5
												11.5 10.0 4.5
												11.5 15.0 4.5
												10.0 15.0 3.0
												10.0
												10.0 3.0

											</gml:posList>
										</gml:LinearRing>
									</gml:exterior>
								</gml:Polygon>
							</gml:surfaceMember>
							<gml:surfaceMember>
								<gml:Polygon gml:id="_Simple_BD.1_PG.7">
									<gml:exterior>
										<gml:LinearRing gml:id="_Simple_BD.1_PG.7_LR.1">
											<gml:posList srsDimension="3">
												11.5 10.0 4.5
												13.0 10.0 3.0
												13.0 15.0 3.0
												11.5 15.0 4.5
												11.5 10.0 4.5
											</gml:posList>
										</gml:LinearRing>
									</gml:exterior>
								</gml:Polygon>
							</gml:surfaceMember>
						</gml:MultiSurface>
					</bldg:lod2MultiSurface>
				</bldg:RoofSurface>
			</bldg:boundedBy>
			<bldg:boundedBy>
				<bldg:GroundSurface gml:id="_Simple_BD.1_GroundSurface_1">
					<bldg:lod2MultiSurface>
						<gml:MultiSurface>
							<gml:surfaceMember>
								<gml:Polygon gml:id="_Simple_BD.1_PG.1">
									<gml:exterior>
										<gml:LinearRing gml:id="_Simple_BD.1_PG.1_LR.1">
											<gml:posList srsDimension="3">
												10.0 10.0 0.0
												10.0 15.0 0.0
												13.0 15.0 0.0
												13.0 10.0 0.0
												10.0 10.0 0.0
											</gml:posList>
										</gml:LinearRing>
									</gml:exterior>
								</gml:Polygon>
							</gml:surfaceMember>
						</gml:MultiSurface>
					</bldg:lod2MultiSurface>
				</bldg:GroundSurface>
			</bldg:boundedBy>
		</bldg:Building>
	</core:cityObjectMember>
	<gml:featureMember>
		<qual:Validation gml:id="idvalue0">
			<qual:validationDate>2002-05-30T09:00:00</qual:validationDate>
			<qual:validationSoftware>CityDoctor2</qual:validationSoftware>
			<qual:statistics>
				<qual:Statistics>
					<qual:numErrorBuildings>
						<qual:FeatureStatistics>
							<qual:numChecked>1</qual:numChecked>
							<qual:numErrors>1</qual:numErrors>
						</qual:FeatureStatistics>
					</qual:numErrorBuildings>
					<qual:numErrorVegetation>
						<qual:FeatureStatistics>
							<qual:numChecked>0</qual:numChecked>
							<qual:numErrors>0</qual:numErrors>
						</qual:FeatureStatistics>
					</qual:numErrorVegetation>
					<qual:numErrorLandObjects>
						<qual:FeatureStatistics>
							<qual:numChecked>0</qual:numChecked>
							<qual:numErrors>0</qual:numErrors>
						</qual:FeatureStatistics>
					</qual:numErrorLandObjects>
					<qual:numErrorBridgeObjects>
						<qual:FeatureStatistics>
							<qual:numChecked>0</qual:numChecked>
							<qual:numErrors>0</qual:numErrors>
						</qual:FeatureStatistics>
					</qual:numErrorBridgeObjects>
					<qual:numErrorWaterObjects>
						<qual:FeatureStatistics>
							<qual:numChecked>0</qual:numChecked>
							<qual:numErrors>0</qual:numErrors>
						</qual:FeatureStatistics>
					</qual:numErrorWaterObjects>
					<qual:numErrorTransportation>
						<qual:FeatureStatistics>
							<qual:numChecked>0</qual:numChecked>
							<qual:numErrors>0</qual:numErrors>
						</qual:FeatureStatistics>
					</qual:numErrorTransportation>
					<qual:error>
						<qual:Error>
							<qual:occurrences>1</qual:occurrences>
							<qual:name>GE_R_CONSECUTIVE_POINTS_SAME</qual:name>
						</qual:Error>
					</qual:error>
				</qual:Statistics>
			</qual:statistics>
			<qual:validationPlan>
				<qual:ValidationPlan>
					<qual:globalParameters>
						<qual:GlobalParameters>
							<qual:parameter>
								<qual:Parameter>
									<qual:name>numberOfRoundingPlaces</qual:name>
									<qual:value>8</qual:value>
								</qual:Parameter>
							</qual:parameter>
							<qual:parameter>
								<qual:Parameter>
									<qual:name>minVertexDistance</qual:name>
									<qual:uom>m</qual:uom>
									<qual:value>0.0001</qual:value>
								</qual:Parameter>
							</qual:parameter>
							<qual:parameter>
								<qual:Parameter>
									<qual:name>schematronFile</qual:name>
									<qual:value></qual:value>
								</qual:Parameter>
							</qual:parameter>
						</qual:GlobalParameters>
					</qual:globalParameters>
					<qual:filter>
						<qual:Filter>
							<qual:checking>
								<qual:Checking>
									<qual:featureType>BUILDING</qual:featureType>
								</qual:Checking>
							</qual:checking>
							<qual:checking>
								<qual:Checking>
									<qual:featureType>TRANSPORTATION</qual:featureType>
								</qual:Checking>
							</qual:checking>
							<qual:checking>
								<qual:Checking>
									<qual:featureType>VEGETATION</qual:featureType>
								</qual:Checking>
							</qual:checking>
							<qual:checking>
								<qual:Checking>
									<qual:featureType>BRIDGE</qual:featureType>
								</qual:Checking>
							</qual:checking>
							<qual:checking>
								<qual:Checking>
									<qual:featureType>WATER</qual:featureType>
								</qual:Checking>
							</qual:checking>
							<qual:checking>
								<qual:Checking>
									<qual:featureType>LAND</qual:featureType>
								</qual:Checking>
							</qual:checking>
						</qual:Filter>
					</qual:filter>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_R_TOO_FEW_POINTS</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_R_NOT_CLOSED</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_R_CONSECUTIVE_POINTS_SAME</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_R_SELF_INTERSECTION</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_P_NON_PLANAR</qual:requirementType>
							<qual:parameter>
								<qual:Parameter>
									<qual:name>type</qual:name>
									<qual:value>distance</qual:value>
								</qual:Parameter>
							</qual:parameter>
							<qual:parameter>
								<qual:Parameter>
									<qual:name>distanceTolerance</qual:name>
									<qual:uom>m</qual:uom>
									<qual:value>0.01</qual:value>
								</qual:Parameter>
							</qual:parameter>
							<qual:parameter>
								<qual:Parameter>
									<qual:name>angleTolerance</qual:name>
									<qual:uom>deg</qual:uom>
									<qual:value>1</qual:value>
								</qual:Parameter>
							</qual:parameter>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_P_INTERIOR_DISCONNECTED</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_P_INTERSECTING_RINGS</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_P_HOLE_OUTSIDE</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_P_ORIENTATION_RINGS_SAME</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_P_INNER_RINGS_NESTED</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_S_TOO_FEW_POLYGONS</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_S_NOT_CLOSED</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_S_NON_MANIFOLD_EDGE</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_S_POLYGON_WRONG_ORIENTATION</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_S_ALL_POLYGONS_WRONG_ORIENTATION</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_S_NON_MANIFOLD_VERTEX</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_S_SELF_INTERSECTION</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
					<qual:requirement>
						<qual:Requirement>
							<qual:enabled>true</qual:enabled>
							<qual:requirementType>R_GE_S_MULTIPLE_CONNECTED_COMPONENTS</qual:requirementType>
						</qual:Requirement>
					</qual:requirement>
				</qual:ValidationPlan>
			</qual:validationPlan>
		</qual:Validation>
	</gml:featureMember>
</core:CityModel>