// java wrapper for vtkMeshQuality object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMeshQuality extends vtkDataSetAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetSaveCellQuality_4(int id0);
  public void SetSaveCellQuality(int id0)
  {
    SetSaveCellQuality_4(id0);
  }

  private native int GetSaveCellQuality_5();
  public int GetSaveCellQuality()
  {
    return GetSaveCellQuality_5();
  }

  private native void SaveCellQualityOn_6();
  public void SaveCellQualityOn()
  {
    SaveCellQualityOn_6();
  }

  private native void SaveCellQualityOff_7();
  public void SaveCellQualityOff()
  {
    SaveCellQualityOff_7();
  }

  private native void SetLinearApproximation_8(boolean id0);
  public void SetLinearApproximation(boolean id0)
  {
    SetLinearApproximation_8(id0);
  }

  private native boolean GetLinearApproximation_9();
  public boolean GetLinearApproximation()
  {
    return GetLinearApproximation_9();
  }

  private native void LinearApproximationOn_10();
  public void LinearApproximationOn()
  {
    LinearApproximationOn_10();
  }

  private native void LinearApproximationOff_11();
  public void LinearApproximationOff()
  {
    LinearApproximationOff_11();
  }

  private native void SetTriangleQualityMeasure_12(int id0);
  public void SetTriangleQualityMeasure(int id0)
  {
    SetTriangleQualityMeasure_12(id0);
  }

  private native void SetTriangleQualityMeasureToArea_13();
  public void SetTriangleQualityMeasureToArea()
  {
    SetTriangleQualityMeasureToArea_13();
  }

  private native void SetTriangleQualityMeasureToEdgeRatio_14();
  public void SetTriangleQualityMeasureToEdgeRatio()
  {
    SetTriangleQualityMeasureToEdgeRatio_14();
  }

  private native void SetTriangleQualityMeasureToAspectRatio_15();
  public void SetTriangleQualityMeasureToAspectRatio()
  {
    SetTriangleQualityMeasureToAspectRatio_15();
  }

  private native void SetTriangleQualityMeasureToRadiusRatio_16();
  public void SetTriangleQualityMeasureToRadiusRatio()
  {
    SetTriangleQualityMeasureToRadiusRatio_16();
  }

  private native void SetTriangleQualityMeasureToAspectFrobenius_17();
  public void SetTriangleQualityMeasureToAspectFrobenius()
  {
    SetTriangleQualityMeasureToAspectFrobenius_17();
  }

  private native void SetTriangleQualityMeasureToMinAngle_18();
  public void SetTriangleQualityMeasureToMinAngle()
  {
    SetTriangleQualityMeasureToMinAngle_18();
  }

  private native void SetTriangleQualityMeasureToMaxAngle_19();
  public void SetTriangleQualityMeasureToMaxAngle()
  {
    SetTriangleQualityMeasureToMaxAngle_19();
  }

  private native void SetTriangleQualityMeasureToCondition_20();
  public void SetTriangleQualityMeasureToCondition()
  {
    SetTriangleQualityMeasureToCondition_20();
  }

  private native void SetTriangleQualityMeasureToScaledJacobian_21();
  public void SetTriangleQualityMeasureToScaledJacobian()
  {
    SetTriangleQualityMeasureToScaledJacobian_21();
  }

  private native void SetTriangleQualityMeasureToRelativeSizeSquared_22();
  public void SetTriangleQualityMeasureToRelativeSizeSquared()
  {
    SetTriangleQualityMeasureToRelativeSizeSquared_22();
  }

  private native void SetTriangleQualityMeasureToShape_23();
  public void SetTriangleQualityMeasureToShape()
  {
    SetTriangleQualityMeasureToShape_23();
  }

  private native void SetTriangleQualityMeasureToShapeAndSize_24();
  public void SetTriangleQualityMeasureToShapeAndSize()
  {
    SetTriangleQualityMeasureToShapeAndSize_24();
  }

  private native void SetTriangleQualityMeasureToDistortion_25();
  public void SetTriangleQualityMeasureToDistortion()
  {
    SetTriangleQualityMeasureToDistortion_25();
  }

  private native void SetTriangleQualityMeasureToEquiangleSkew_26();
  public void SetTriangleQualityMeasureToEquiangleSkew()
  {
    SetTriangleQualityMeasureToEquiangleSkew_26();
  }

  private native void SetTriangleQualityMeasureToNormalizedInradius_27();
  public void SetTriangleQualityMeasureToNormalizedInradius()
  {
    SetTriangleQualityMeasureToNormalizedInradius_27();
  }

  private native void SetQuadQualityMeasure_28(int id0);
  public void SetQuadQualityMeasure(int id0)
  {
    SetQuadQualityMeasure_28(id0);
  }

  private native void SetQuadQualityMeasureToEdgeRatio_29();
  public void SetQuadQualityMeasureToEdgeRatio()
  {
    SetQuadQualityMeasureToEdgeRatio_29();
  }

  private native void SetQuadQualityMeasureToAspectRatio_30();
  public void SetQuadQualityMeasureToAspectRatio()
  {
    SetQuadQualityMeasureToAspectRatio_30();
  }

  private native void SetQuadQualityMeasureToRadiusRatio_31();
  public void SetQuadQualityMeasureToRadiusRatio()
  {
    SetQuadQualityMeasureToRadiusRatio_31();
  }

  private native void SetQuadQualityMeasureToMedAspectFrobenius_32();
  public void SetQuadQualityMeasureToMedAspectFrobenius()
  {
    SetQuadQualityMeasureToMedAspectFrobenius_32();
  }

  private native void SetQuadQualityMeasureToMaxAspectFrobenius_33();
  public void SetQuadQualityMeasureToMaxAspectFrobenius()
  {
    SetQuadQualityMeasureToMaxAspectFrobenius_33();
  }

  private native void SetQuadQualityMeasureToMaxEdgeRatio_34();
  public void SetQuadQualityMeasureToMaxEdgeRatio()
  {
    SetQuadQualityMeasureToMaxEdgeRatio_34();
  }

  private native void SetQuadQualityMeasureToSkew_35();
  public void SetQuadQualityMeasureToSkew()
  {
    SetQuadQualityMeasureToSkew_35();
  }

  private native void SetQuadQualityMeasureToTaper_36();
  public void SetQuadQualityMeasureToTaper()
  {
    SetQuadQualityMeasureToTaper_36();
  }

  private native void SetQuadQualityMeasureToWarpage_37();
  public void SetQuadQualityMeasureToWarpage()
  {
    SetQuadQualityMeasureToWarpage_37();
  }

  private native void SetQuadQualityMeasureToArea_38();
  public void SetQuadQualityMeasureToArea()
  {
    SetQuadQualityMeasureToArea_38();
  }

  private native void SetQuadQualityMeasureToStretch_39();
  public void SetQuadQualityMeasureToStretch()
  {
    SetQuadQualityMeasureToStretch_39();
  }

  private native void SetQuadQualityMeasureToMinAngle_40();
  public void SetQuadQualityMeasureToMinAngle()
  {
    SetQuadQualityMeasureToMinAngle_40();
  }

  private native void SetQuadQualityMeasureToMaxAngle_41();
  public void SetQuadQualityMeasureToMaxAngle()
  {
    SetQuadQualityMeasureToMaxAngle_41();
  }

  private native void SetQuadQualityMeasureToOddy_42();
  public void SetQuadQualityMeasureToOddy()
  {
    SetQuadQualityMeasureToOddy_42();
  }

  private native void SetQuadQualityMeasureToCondition_43();
  public void SetQuadQualityMeasureToCondition()
  {
    SetQuadQualityMeasureToCondition_43();
  }

  private native void SetQuadQualityMeasureToJacobian_44();
  public void SetQuadQualityMeasureToJacobian()
  {
    SetQuadQualityMeasureToJacobian_44();
  }

  private native void SetQuadQualityMeasureToScaledJacobian_45();
  public void SetQuadQualityMeasureToScaledJacobian()
  {
    SetQuadQualityMeasureToScaledJacobian_45();
  }

  private native void SetQuadQualityMeasureToShear_46();
  public void SetQuadQualityMeasureToShear()
  {
    SetQuadQualityMeasureToShear_46();
  }

  private native void SetQuadQualityMeasureToShape_47();
  public void SetQuadQualityMeasureToShape()
  {
    SetQuadQualityMeasureToShape_47();
  }

  private native void SetQuadQualityMeasureToRelativeSizeSquared_48();
  public void SetQuadQualityMeasureToRelativeSizeSquared()
  {
    SetQuadQualityMeasureToRelativeSizeSquared_48();
  }

  private native void SetQuadQualityMeasureToShapeAndSize_49();
  public void SetQuadQualityMeasureToShapeAndSize()
  {
    SetQuadQualityMeasureToShapeAndSize_49();
  }

  private native void SetQuadQualityMeasureToShearAndSize_50();
  public void SetQuadQualityMeasureToShearAndSize()
  {
    SetQuadQualityMeasureToShearAndSize_50();
  }

  private native void SetQuadQualityMeasureToDistortion_51();
  public void SetQuadQualityMeasureToDistortion()
  {
    SetQuadQualityMeasureToDistortion_51();
  }

  private native void SetQuadQualityMeasureToEquiangleSkew_52();
  public void SetQuadQualityMeasureToEquiangleSkew()
  {
    SetQuadQualityMeasureToEquiangleSkew_52();
  }

  private native void SetTetQualityMeasure_53(int id0);
  public void SetTetQualityMeasure(int id0)
  {
    SetTetQualityMeasure_53(id0);
  }

  private native void SetTetQualityMeasureToEdgeRatio_54();
  public void SetTetQualityMeasureToEdgeRatio()
  {
    SetTetQualityMeasureToEdgeRatio_54();
  }

  private native void SetTetQualityMeasureToAspectRatio_55();
  public void SetTetQualityMeasureToAspectRatio()
  {
    SetTetQualityMeasureToAspectRatio_55();
  }

  private native void SetTetQualityMeasureToRadiusRatio_56();
  public void SetTetQualityMeasureToRadiusRatio()
  {
    SetTetQualityMeasureToRadiusRatio_56();
  }

  private native void SetTetQualityMeasureToAspectFrobenius_57();
  public void SetTetQualityMeasureToAspectFrobenius()
  {
    SetTetQualityMeasureToAspectFrobenius_57();
  }

  private native void SetTetQualityMeasureToMinAngle_58();
  public void SetTetQualityMeasureToMinAngle()
  {
    SetTetQualityMeasureToMinAngle_58();
  }

  private native void SetTetQualityMeasureToCollapseRatio_59();
  public void SetTetQualityMeasureToCollapseRatio()
  {
    SetTetQualityMeasureToCollapseRatio_59();
  }

  private native void SetTetQualityMeasureToAspectGamma_60();
  public void SetTetQualityMeasureToAspectGamma()
  {
    SetTetQualityMeasureToAspectGamma_60();
  }

  private native void SetTetQualityMeasureToVolume_61();
  public void SetTetQualityMeasureToVolume()
  {
    SetTetQualityMeasureToVolume_61();
  }

  private native void SetTetQualityMeasureToCondition_62();
  public void SetTetQualityMeasureToCondition()
  {
    SetTetQualityMeasureToCondition_62();
  }

  private native void SetTetQualityMeasureToJacobian_63();
  public void SetTetQualityMeasureToJacobian()
  {
    SetTetQualityMeasureToJacobian_63();
  }

  private native void SetTetQualityMeasureToScaledJacobian_64();
  public void SetTetQualityMeasureToScaledJacobian()
  {
    SetTetQualityMeasureToScaledJacobian_64();
  }

  private native void SetTetQualityMeasureToShape_65();
  public void SetTetQualityMeasureToShape()
  {
    SetTetQualityMeasureToShape_65();
  }

  private native void SetTetQualityMeasureToRelativeSizeSquared_66();
  public void SetTetQualityMeasureToRelativeSizeSquared()
  {
    SetTetQualityMeasureToRelativeSizeSquared_66();
  }

  private native void SetTetQualityMeasureToShapeAndSize_67();
  public void SetTetQualityMeasureToShapeAndSize()
  {
    SetTetQualityMeasureToShapeAndSize_67();
  }

  private native void SetTetQualityMeasureToDistortion_68();
  public void SetTetQualityMeasureToDistortion()
  {
    SetTetQualityMeasureToDistortion_68();
  }

  private native void SetTetQualityMeasureToEquiangleSkew_69();
  public void SetTetQualityMeasureToEquiangleSkew()
  {
    SetTetQualityMeasureToEquiangleSkew_69();
  }

  private native void SetTetQualityMeasureToEquivolumeSkew_70();
  public void SetTetQualityMeasureToEquivolumeSkew()
  {
    SetTetQualityMeasureToEquivolumeSkew_70();
  }

  private native void SetTetQualityMeasureToMeanRatio_71();
  public void SetTetQualityMeasureToMeanRatio()
  {
    SetTetQualityMeasureToMeanRatio_71();
  }

  private native void SetTetQualityMeasureToNormalizedInradius_72();
  public void SetTetQualityMeasureToNormalizedInradius()
  {
    SetTetQualityMeasureToNormalizedInradius_72();
  }

  private native void SetTetQualityMeasureToSquishIndex_73();
  public void SetTetQualityMeasureToSquishIndex()
  {
    SetTetQualityMeasureToSquishIndex_73();
  }

  private native void SetPyramidQualityMeasure_74(int id0);
  public void SetPyramidQualityMeasure(int id0)
  {
    SetPyramidQualityMeasure_74(id0);
  }

  private native void SetPyramidQualityMeasureToEquiangleSkew_75();
  public void SetPyramidQualityMeasureToEquiangleSkew()
  {
    SetPyramidQualityMeasureToEquiangleSkew_75();
  }

  private native void SetPyramidQualityMeasureToJacobian_76();
  public void SetPyramidQualityMeasureToJacobian()
  {
    SetPyramidQualityMeasureToJacobian_76();
  }

  private native void SetPyramidQualityMeasureToScaledJacobian_77();
  public void SetPyramidQualityMeasureToScaledJacobian()
  {
    SetPyramidQualityMeasureToScaledJacobian_77();
  }

  private native void SetPyramidQualityMeasureToShape_78();
  public void SetPyramidQualityMeasureToShape()
  {
    SetPyramidQualityMeasureToShape_78();
  }

  private native void SetPyramidQualityMeasureToVolume_79();
  public void SetPyramidQualityMeasureToVolume()
  {
    SetPyramidQualityMeasureToVolume_79();
  }

  private native void SetWedgeQualityMeasure_80(int id0);
  public void SetWedgeQualityMeasure(int id0)
  {
    SetWedgeQualityMeasure_80(id0);
  }

  private native void SetWedgeQualityMeasureToCondition_81();
  public void SetWedgeQualityMeasureToCondition()
  {
    SetWedgeQualityMeasureToCondition_81();
  }

  private native void SetWedgeQualityMeasureToDistortion_82();
  public void SetWedgeQualityMeasureToDistortion()
  {
    SetWedgeQualityMeasureToDistortion_82();
  }

  private native void SetWedgeQualityMeasureToEdgeRatio_83();
  public void SetWedgeQualityMeasureToEdgeRatio()
  {
    SetWedgeQualityMeasureToEdgeRatio_83();
  }

  private native void SetWedgeQualityMeasureToEquiangleSkew_84();
  public void SetWedgeQualityMeasureToEquiangleSkew()
  {
    SetWedgeQualityMeasureToEquiangleSkew_84();
  }

  private native void SetWedgeQualityMeasureToJacobian_85();
  public void SetWedgeQualityMeasureToJacobian()
  {
    SetWedgeQualityMeasureToJacobian_85();
  }

  private native void SetWedgeQualityMeasureToMaxAspectFrobenius_86();
  public void SetWedgeQualityMeasureToMaxAspectFrobenius()
  {
    SetWedgeQualityMeasureToMaxAspectFrobenius_86();
  }

  private native void SetWedgeQualityMeasureToMaxStretch_87();
  public void SetWedgeQualityMeasureToMaxStretch()
  {
    SetWedgeQualityMeasureToMaxStretch_87();
  }

  private native void SetWedgeQualityMeasureToMeanAspectFrobenius_88();
  public void SetWedgeQualityMeasureToMeanAspectFrobenius()
  {
    SetWedgeQualityMeasureToMeanAspectFrobenius_88();
  }

  private native void SetWedgeQualityMeasureToScaledJacobian_89();
  public void SetWedgeQualityMeasureToScaledJacobian()
  {
    SetWedgeQualityMeasureToScaledJacobian_89();
  }

  private native void SetWedgeQualityMeasureToShape_90();
  public void SetWedgeQualityMeasureToShape()
  {
    SetWedgeQualityMeasureToShape_90();
  }

  private native void SetWedgeQualityMeasureToVolume_91();
  public void SetWedgeQualityMeasureToVolume()
  {
    SetWedgeQualityMeasureToVolume_91();
  }

  private native void SetHexQualityMeasure_92(int id0);
  public void SetHexQualityMeasure(int id0)
  {
    SetHexQualityMeasure_92(id0);
  }

  private native void SetHexQualityMeasureToEdgeRatio_93();
  public void SetHexQualityMeasureToEdgeRatio()
  {
    SetHexQualityMeasureToEdgeRatio_93();
  }

  private native void SetHexQualityMeasureToMedAspectFrobenius_94();
  public void SetHexQualityMeasureToMedAspectFrobenius()
  {
    SetHexQualityMeasureToMedAspectFrobenius_94();
  }

  private native void SetHexQualityMeasureToMaxAspectFrobenius_95();
  public void SetHexQualityMeasureToMaxAspectFrobenius()
  {
    SetHexQualityMeasureToMaxAspectFrobenius_95();
  }

  private native void SetHexQualityMeasureToMaxEdgeRatio_96();
  public void SetHexQualityMeasureToMaxEdgeRatio()
  {
    SetHexQualityMeasureToMaxEdgeRatio_96();
  }

  private native void SetHexQualityMeasureToSkew_97();
  public void SetHexQualityMeasureToSkew()
  {
    SetHexQualityMeasureToSkew_97();
  }

  private native void SetHexQualityMeasureToTaper_98();
  public void SetHexQualityMeasureToTaper()
  {
    SetHexQualityMeasureToTaper_98();
  }

  private native void SetHexQualityMeasureToVolume_99();
  public void SetHexQualityMeasureToVolume()
  {
    SetHexQualityMeasureToVolume_99();
  }

  private native void SetHexQualityMeasureToStretch_100();
  public void SetHexQualityMeasureToStretch()
  {
    SetHexQualityMeasureToStretch_100();
  }

  private native void SetHexQualityMeasureToDiagonal_101();
  public void SetHexQualityMeasureToDiagonal()
  {
    SetHexQualityMeasureToDiagonal_101();
  }

  private native void SetHexQualityMeasureToDimension_102();
  public void SetHexQualityMeasureToDimension()
  {
    SetHexQualityMeasureToDimension_102();
  }

  private native void SetHexQualityMeasureToOddy_103();
  public void SetHexQualityMeasureToOddy()
  {
    SetHexQualityMeasureToOddy_103();
  }

  private native void SetHexQualityMeasureToCondition_104();
  public void SetHexQualityMeasureToCondition()
  {
    SetHexQualityMeasureToCondition_104();
  }

  private native void SetHexQualityMeasureToJacobian_105();
  public void SetHexQualityMeasureToJacobian()
  {
    SetHexQualityMeasureToJacobian_105();
  }

  private native void SetHexQualityMeasureToScaledJacobian_106();
  public void SetHexQualityMeasureToScaledJacobian()
  {
    SetHexQualityMeasureToScaledJacobian_106();
  }

  private native void SetHexQualityMeasureToShear_107();
  public void SetHexQualityMeasureToShear()
  {
    SetHexQualityMeasureToShear_107();
  }

  private native void SetHexQualityMeasureToShape_108();
  public void SetHexQualityMeasureToShape()
  {
    SetHexQualityMeasureToShape_108();
  }

  private native void SetHexQualityMeasureToRelativeSizeSquared_109();
  public void SetHexQualityMeasureToRelativeSizeSquared()
  {
    SetHexQualityMeasureToRelativeSizeSquared_109();
  }

  private native void SetHexQualityMeasureToShapeAndSize_110();
  public void SetHexQualityMeasureToShapeAndSize()
  {
    SetHexQualityMeasureToShapeAndSize_110();
  }

  private native void SetHexQualityMeasureToShearAndSize_111();
  public void SetHexQualityMeasureToShearAndSize()
  {
    SetHexQualityMeasureToShearAndSize_111();
  }

  private native void SetHexQualityMeasureToDistortion_112();
  public void SetHexQualityMeasureToDistortion()
  {
    SetHexQualityMeasureToDistortion_112();
  }

  private native void SetHexQualityMeasureToEquiangleSkew_113();
  public void SetHexQualityMeasureToEquiangleSkew()
  {
    SetHexQualityMeasureToEquiangleSkew_113();
  }

  private native void SetHexQualityMeasureToNodalJacobianRatio_114();
  public void SetHexQualityMeasureToNodalJacobianRatio()
  {
    SetHexQualityMeasureToNodalJacobianRatio_114();
  }

  private native double TriangleArea_115(vtkCell id0);
  public double TriangleArea(vtkCell id0)
  {
    return TriangleArea_115(id0);
  }

  private native double TriangleEdgeRatio_116(vtkCell id0);
  public double TriangleEdgeRatio(vtkCell id0)
  {
    return TriangleEdgeRatio_116(id0);
  }

  private native double TriangleAspectRatio_117(vtkCell id0);
  public double TriangleAspectRatio(vtkCell id0)
  {
    return TriangleAspectRatio_117(id0);
  }

  private native double TriangleRadiusRatio_118(vtkCell id0);
  public double TriangleRadiusRatio(vtkCell id0)
  {
    return TriangleRadiusRatio_118(id0);
  }

  private native double TriangleAspectFrobenius_119(vtkCell id0);
  public double TriangleAspectFrobenius(vtkCell id0)
  {
    return TriangleAspectFrobenius_119(id0);
  }

  private native double TriangleMinAngle_120(vtkCell id0);
  public double TriangleMinAngle(vtkCell id0)
  {
    return TriangleMinAngle_120(id0);
  }

  private native double TriangleMaxAngle_121(vtkCell id0);
  public double TriangleMaxAngle(vtkCell id0)
  {
    return TriangleMaxAngle_121(id0);
  }

  private native double TriangleCondition_122(vtkCell id0);
  public double TriangleCondition(vtkCell id0)
  {
    return TriangleCondition_122(id0);
  }

  private native double TriangleScaledJacobian_123(vtkCell id0);
  public double TriangleScaledJacobian(vtkCell id0)
  {
    return TriangleScaledJacobian_123(id0);
  }

  private native double TriangleRelativeSizeSquared_124(vtkCell id0);
  public double TriangleRelativeSizeSquared(vtkCell id0)
  {
    return TriangleRelativeSizeSquared_124(id0);
  }

  private native double TriangleShape_125(vtkCell id0);
  public double TriangleShape(vtkCell id0)
  {
    return TriangleShape_125(id0);
  }

  private native double TriangleShapeAndSize_126(vtkCell id0);
  public double TriangleShapeAndSize(vtkCell id0)
  {
    return TriangleShapeAndSize_126(id0);
  }

  private native double TriangleDistortion_127(vtkCell id0);
  public double TriangleDistortion(vtkCell id0)
  {
    return TriangleDistortion_127(id0);
  }

  private native double TriangleEquiangleSkew_128(vtkCell id0);
  public double TriangleEquiangleSkew(vtkCell id0)
  {
    return TriangleEquiangleSkew_128(id0);
  }

  private native double TriangleNormalizedInradius_129(vtkCell id0);
  public double TriangleNormalizedInradius(vtkCell id0)
  {
    return TriangleNormalizedInradius_129(id0);
  }

  private native double QuadEdgeRatio_130(vtkCell id0);
  public double QuadEdgeRatio(vtkCell id0)
  {
    return QuadEdgeRatio_130(id0);
  }

  private native double QuadAspectRatio_131(vtkCell id0);
  public double QuadAspectRatio(vtkCell id0)
  {
    return QuadAspectRatio_131(id0);
  }

  private native double QuadRadiusRatio_132(vtkCell id0);
  public double QuadRadiusRatio(vtkCell id0)
  {
    return QuadRadiusRatio_132(id0);
  }

  private native double QuadMedAspectFrobenius_133(vtkCell id0);
  public double QuadMedAspectFrobenius(vtkCell id0)
  {
    return QuadMedAspectFrobenius_133(id0);
  }

  private native double QuadMaxAspectFrobenius_134(vtkCell id0);
  public double QuadMaxAspectFrobenius(vtkCell id0)
  {
    return QuadMaxAspectFrobenius_134(id0);
  }

  private native double QuadMinAngle_135(vtkCell id0);
  public double QuadMinAngle(vtkCell id0)
  {
    return QuadMinAngle_135(id0);
  }

  private native double QuadMaxEdgeRatio_136(vtkCell id0);
  public double QuadMaxEdgeRatio(vtkCell id0)
  {
    return QuadMaxEdgeRatio_136(id0);
  }

  private native double QuadSkew_137(vtkCell id0);
  public double QuadSkew(vtkCell id0)
  {
    return QuadSkew_137(id0);
  }

  private native double QuadTaper_138(vtkCell id0);
  public double QuadTaper(vtkCell id0)
  {
    return QuadTaper_138(id0);
  }

  private native double QuadWarpage_139(vtkCell id0);
  public double QuadWarpage(vtkCell id0)
  {
    return QuadWarpage_139(id0);
  }

  private native double QuadArea_140(vtkCell id0);
  public double QuadArea(vtkCell id0)
  {
    return QuadArea_140(id0);
  }

  private native double QuadStretch_141(vtkCell id0);
  public double QuadStretch(vtkCell id0)
  {
    return QuadStretch_141(id0);
  }

  private native double QuadMaxAngle_142(vtkCell id0);
  public double QuadMaxAngle(vtkCell id0)
  {
    return QuadMaxAngle_142(id0);
  }

  private native double QuadOddy_143(vtkCell id0);
  public double QuadOddy(vtkCell id0)
  {
    return QuadOddy_143(id0);
  }

  private native double QuadCondition_144(vtkCell id0);
  public double QuadCondition(vtkCell id0)
  {
    return QuadCondition_144(id0);
  }

  private native double QuadJacobian_145(vtkCell id0);
  public double QuadJacobian(vtkCell id0)
  {
    return QuadJacobian_145(id0);
  }

  private native double QuadScaledJacobian_146(vtkCell id0);
  public double QuadScaledJacobian(vtkCell id0)
  {
    return QuadScaledJacobian_146(id0);
  }

  private native double QuadShear_147(vtkCell id0);
  public double QuadShear(vtkCell id0)
  {
    return QuadShear_147(id0);
  }

  private native double QuadShape_148(vtkCell id0);
  public double QuadShape(vtkCell id0)
  {
    return QuadShape_148(id0);
  }

  private native double QuadRelativeSizeSquared_149(vtkCell id0);
  public double QuadRelativeSizeSquared(vtkCell id0)
  {
    return QuadRelativeSizeSquared_149(id0);
  }

  private native double QuadShapeAndSize_150(vtkCell id0);
  public double QuadShapeAndSize(vtkCell id0)
  {
    return QuadShapeAndSize_150(id0);
  }

  private native double QuadShearAndSize_151(vtkCell id0);
  public double QuadShearAndSize(vtkCell id0)
  {
    return QuadShearAndSize_151(id0);
  }

  private native double QuadDistortion_152(vtkCell id0);
  public double QuadDistortion(vtkCell id0)
  {
    return QuadDistortion_152(id0);
  }

  private native double QuadEquiangleSkew_153(vtkCell id0);
  public double QuadEquiangleSkew(vtkCell id0)
  {
    return QuadEquiangleSkew_153(id0);
  }

  private native double TetEdgeRatio_154(vtkCell id0);
  public double TetEdgeRatio(vtkCell id0)
  {
    return TetEdgeRatio_154(id0);
  }

  private native double TetAspectRatio_155(vtkCell id0);
  public double TetAspectRatio(vtkCell id0)
  {
    return TetAspectRatio_155(id0);
  }

  private native double TetRadiusRatio_156(vtkCell id0);
  public double TetRadiusRatio(vtkCell id0)
  {
    return TetRadiusRatio_156(id0);
  }

  private native double TetAspectFrobenius_157(vtkCell id0);
  public double TetAspectFrobenius(vtkCell id0)
  {
    return TetAspectFrobenius_157(id0);
  }

  private native double TetMinAngle_158(vtkCell id0);
  public double TetMinAngle(vtkCell id0)
  {
    return TetMinAngle_158(id0);
  }

  private native double TetCollapseRatio_159(vtkCell id0);
  public double TetCollapseRatio(vtkCell id0)
  {
    return TetCollapseRatio_159(id0);
  }

  private native double TetAspectGamma_160(vtkCell id0);
  public double TetAspectGamma(vtkCell id0)
  {
    return TetAspectGamma_160(id0);
  }

  private native double TetVolume_161(vtkCell id0);
  public double TetVolume(vtkCell id0)
  {
    return TetVolume_161(id0);
  }

  private native double TetCondition_162(vtkCell id0);
  public double TetCondition(vtkCell id0)
  {
    return TetCondition_162(id0);
  }

  private native double TetJacobian_163(vtkCell id0);
  public double TetJacobian(vtkCell id0)
  {
    return TetJacobian_163(id0);
  }

  private native double TetScaledJacobian_164(vtkCell id0);
  public double TetScaledJacobian(vtkCell id0)
  {
    return TetScaledJacobian_164(id0);
  }

  private native double TetShape_165(vtkCell id0);
  public double TetShape(vtkCell id0)
  {
    return TetShape_165(id0);
  }

  private native double TetRelativeSizeSquared_166(vtkCell id0);
  public double TetRelativeSizeSquared(vtkCell id0)
  {
    return TetRelativeSizeSquared_166(id0);
  }

  private native double TetShapeAndSize_167(vtkCell id0);
  public double TetShapeAndSize(vtkCell id0)
  {
    return TetShapeAndSize_167(id0);
  }

  private native double TetDistortion_168(vtkCell id0);
  public double TetDistortion(vtkCell id0)
  {
    return TetDistortion_168(id0);
  }

  private native double TetEquiangleSkew_169(vtkCell id0);
  public double TetEquiangleSkew(vtkCell id0)
  {
    return TetEquiangleSkew_169(id0);
  }

  private native double TetEquivolumeSkew_170(vtkCell id0);
  public double TetEquivolumeSkew(vtkCell id0)
  {
    return TetEquivolumeSkew_170(id0);
  }

  private native double TetMeanRatio_171(vtkCell id0);
  public double TetMeanRatio(vtkCell id0)
  {
    return TetMeanRatio_171(id0);
  }

  private native double TetNormalizedInradius_172(vtkCell id0);
  public double TetNormalizedInradius(vtkCell id0)
  {
    return TetNormalizedInradius_172(id0);
  }

  private native double TetSquishIndex_173(vtkCell id0);
  public double TetSquishIndex(vtkCell id0)
  {
    return TetSquishIndex_173(id0);
  }

  private native double PyramidEquiangleSkew_174(vtkCell id0);
  public double PyramidEquiangleSkew(vtkCell id0)
  {
    return PyramidEquiangleSkew_174(id0);
  }

  private native double PyramidJacobian_175(vtkCell id0);
  public double PyramidJacobian(vtkCell id0)
  {
    return PyramidJacobian_175(id0);
  }

  private native double PyramidScaledJacobian_176(vtkCell id0);
  public double PyramidScaledJacobian(vtkCell id0)
  {
    return PyramidScaledJacobian_176(id0);
  }

  private native double PyramidShape_177(vtkCell id0);
  public double PyramidShape(vtkCell id0)
  {
    return PyramidShape_177(id0);
  }

  private native double PyramidVolume_178(vtkCell id0);
  public double PyramidVolume(vtkCell id0)
  {
    return PyramidVolume_178(id0);
  }

  private native double WedgeCondition_179(vtkCell id0);
  public double WedgeCondition(vtkCell id0)
  {
    return WedgeCondition_179(id0);
  }

  private native double WedgeDistortion_180(vtkCell id0);
  public double WedgeDistortion(vtkCell id0)
  {
    return WedgeDistortion_180(id0);
  }

  private native double WedgeEdgeRatio_181(vtkCell id0);
  public double WedgeEdgeRatio(vtkCell id0)
  {
    return WedgeEdgeRatio_181(id0);
  }

  private native double WedgeEquiangleSkew_182(vtkCell id0);
  public double WedgeEquiangleSkew(vtkCell id0)
  {
    return WedgeEquiangleSkew_182(id0);
  }

  private native double WedgeJacobian_183(vtkCell id0);
  public double WedgeJacobian(vtkCell id0)
  {
    return WedgeJacobian_183(id0);
  }

  private native double WedgeMaxAspectFrobenius_184(vtkCell id0);
  public double WedgeMaxAspectFrobenius(vtkCell id0)
  {
    return WedgeMaxAspectFrobenius_184(id0);
  }

  private native double WedgeMaxStretch_185(vtkCell id0);
  public double WedgeMaxStretch(vtkCell id0)
  {
    return WedgeMaxStretch_185(id0);
  }

  private native double WedgeMeanAspectFrobenius_186(vtkCell id0);
  public double WedgeMeanAspectFrobenius(vtkCell id0)
  {
    return WedgeMeanAspectFrobenius_186(id0);
  }

  private native double WedgeScaledJacobian_187(vtkCell id0);
  public double WedgeScaledJacobian(vtkCell id0)
  {
    return WedgeScaledJacobian_187(id0);
  }

  private native double WedgeShape_188(vtkCell id0);
  public double WedgeShape(vtkCell id0)
  {
    return WedgeShape_188(id0);
  }

  private native double WedgeVolume_189(vtkCell id0);
  public double WedgeVolume(vtkCell id0)
  {
    return WedgeVolume_189(id0);
  }

  private native double HexEdgeRatio_190(vtkCell id0);
  public double HexEdgeRatio(vtkCell id0)
  {
    return HexEdgeRatio_190(id0);
  }

  private native double HexMedAspectFrobenius_191(vtkCell id0);
  public double HexMedAspectFrobenius(vtkCell id0)
  {
    return HexMedAspectFrobenius_191(id0);
  }

  private native double HexMaxAspectFrobenius_192(vtkCell id0);
  public double HexMaxAspectFrobenius(vtkCell id0)
  {
    return HexMaxAspectFrobenius_192(id0);
  }

  private native double HexMaxEdgeRatio_193(vtkCell id0);
  public double HexMaxEdgeRatio(vtkCell id0)
  {
    return HexMaxEdgeRatio_193(id0);
  }

  private native double HexSkew_194(vtkCell id0);
  public double HexSkew(vtkCell id0)
  {
    return HexSkew_194(id0);
  }

  private native double HexTaper_195(vtkCell id0);
  public double HexTaper(vtkCell id0)
  {
    return HexTaper_195(id0);
  }

  private native double HexVolume_196(vtkCell id0);
  public double HexVolume(vtkCell id0)
  {
    return HexVolume_196(id0);
  }

  private native double HexStretch_197(vtkCell id0);
  public double HexStretch(vtkCell id0)
  {
    return HexStretch_197(id0);
  }

  private native double HexDiagonal_198(vtkCell id0);
  public double HexDiagonal(vtkCell id0)
  {
    return HexDiagonal_198(id0);
  }

  private native double HexDimension_199(vtkCell id0);
  public double HexDimension(vtkCell id0)
  {
    return HexDimension_199(id0);
  }

  private native double HexOddy_200(vtkCell id0);
  public double HexOddy(vtkCell id0)
  {
    return HexOddy_200(id0);
  }

  private native double HexCondition_201(vtkCell id0);
  public double HexCondition(vtkCell id0)
  {
    return HexCondition_201(id0);
  }

  private native double HexJacobian_202(vtkCell id0);
  public double HexJacobian(vtkCell id0)
  {
    return HexJacobian_202(id0);
  }

  private native double HexScaledJacobian_203(vtkCell id0);
  public double HexScaledJacobian(vtkCell id0)
  {
    return HexScaledJacobian_203(id0);
  }

  private native double HexShear_204(vtkCell id0);
  public double HexShear(vtkCell id0)
  {
    return HexShear_204(id0);
  }

  private native double HexShape_205(vtkCell id0);
  public double HexShape(vtkCell id0)
  {
    return HexShape_205(id0);
  }

  private native double HexRelativeSizeSquared_206(vtkCell id0);
  public double HexRelativeSizeSquared(vtkCell id0)
  {
    return HexRelativeSizeSquared_206(id0);
  }

  private native double HexShapeAndSize_207(vtkCell id0);
  public double HexShapeAndSize(vtkCell id0)
  {
    return HexShapeAndSize_207(id0);
  }

  private native double HexShearAndSize_208(vtkCell id0);
  public double HexShearAndSize(vtkCell id0)
  {
    return HexShearAndSize_208(id0);
  }

  private native double HexDistortion_209(vtkCell id0);
  public double HexDistortion(vtkCell id0)
  {
    return HexDistortion_209(id0);
  }

  private native double HexEquiangleSkew_210(vtkCell id0);
  public double HexEquiangleSkew(vtkCell id0)
  {
    return HexEquiangleSkew_210(id0);
  }

  private native double HexNodalJacobianRatio_211(vtkCell id0);
  public double HexNodalJacobianRatio(vtkCell id0)
  {
    return HexNodalJacobianRatio_211(id0);
  }

  private native void SetRatio_212(int id0);
  public void SetRatio(int id0)
  {
    SetRatio_212(id0);
  }

  private native int GetRatio_213();
  public int GetRatio()
  {
    return GetRatio_213();
  }

  private native void RatioOn_214();
  public void RatioOn()
  {
    RatioOn_214();
  }

  private native void RatioOff_215();
  public void RatioOff()
  {
    RatioOff_215();
  }

  public vtkMeshQuality() { super(); }

  public vtkMeshQuality(long id) { super(id); }
  public native long   VTKInit();

}
