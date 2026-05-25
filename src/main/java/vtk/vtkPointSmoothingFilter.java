// java wrapper for vtkPointSmoothingFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointSmoothingFilter extends vtkPointSetAlgorithm
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

  private native void SetNeighborhoodSize_4(int id0);
  public void SetNeighborhoodSize(int id0)
  {
    SetNeighborhoodSize_4(id0);
  }

  private native int GetNeighborhoodSizeMinValue_5();
  public int GetNeighborhoodSizeMinValue()
  {
    return GetNeighborhoodSizeMinValue_5();
  }

  private native int GetNeighborhoodSizeMaxValue_6();
  public int GetNeighborhoodSizeMaxValue()
  {
    return GetNeighborhoodSizeMaxValue_6();
  }

  private native int GetNeighborhoodSize_7();
  public int GetNeighborhoodSize()
  {
    return GetNeighborhoodSize_7();
  }

  private native void SetSmoothingMode_8(int id0);
  public void SetSmoothingMode(int id0)
  {
    SetSmoothingMode_8(id0);
  }

  private native int GetSmoothingModeMinValue_9();
  public int GetSmoothingModeMinValue()
  {
    return GetSmoothingModeMinValue_9();
  }

  private native int GetSmoothingModeMaxValue_10();
  public int GetSmoothingModeMaxValue()
  {
    return GetSmoothingModeMaxValue_10();
  }

  private native int GetSmoothingMode_11();
  public int GetSmoothingMode()
  {
    return GetSmoothingMode_11();
  }

  private native void SetSmoothingModeToDefault_12();
  public void SetSmoothingModeToDefault()
  {
    SetSmoothingModeToDefault_12();
  }

  private native void SetSmoothingModeToGeometric_13();
  public void SetSmoothingModeToGeometric()
  {
    SetSmoothingModeToGeometric_13();
  }

  private native void SetSmoothingModeToUniform_14();
  public void SetSmoothingModeToUniform()
  {
    SetSmoothingModeToUniform_14();
  }

  private native void SetSmoothingModeToScalars_15();
  public void SetSmoothingModeToScalars()
  {
    SetSmoothingModeToScalars_15();
  }

  private native void SetSmoothingModeToTensors_16();
  public void SetSmoothingModeToTensors()
  {
    SetSmoothingModeToTensors_16();
  }

  private native void SetSmoothingModeToFrameField_17();
  public void SetSmoothingModeToFrameField()
  {
    SetSmoothingModeToFrameField_17();
  }

  private native void SetFrameFieldArray_18(vtkDataArray id0);
  public void SetFrameFieldArray(vtkDataArray id0)
  {
    SetFrameFieldArray_18(id0);
  }

  private native long GetFrameFieldArray_19();
  public vtkDataArray GetFrameFieldArray()
  {
    long temp = GetFrameFieldArray_19();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfIterations_20(int id0);
  public void SetNumberOfIterations(int id0)
  {
    SetNumberOfIterations_20(id0);
  }

  private native int GetNumberOfIterationsMinValue_21();
  public int GetNumberOfIterationsMinValue()
  {
    return GetNumberOfIterationsMinValue_21();
  }

  private native int GetNumberOfIterationsMaxValue_22();
  public int GetNumberOfIterationsMaxValue()
  {
    return GetNumberOfIterationsMaxValue_22();
  }

  private native int GetNumberOfIterations_23();
  public int GetNumberOfIterations()
  {
    return GetNumberOfIterations_23();
  }

  private native void SetNumberOfSubIterations_24(int id0);
  public void SetNumberOfSubIterations(int id0)
  {
    SetNumberOfSubIterations_24(id0);
  }

  private native int GetNumberOfSubIterationsMinValue_25();
  public int GetNumberOfSubIterationsMinValue()
  {
    return GetNumberOfSubIterationsMinValue_25();
  }

  private native int GetNumberOfSubIterationsMaxValue_26();
  public int GetNumberOfSubIterationsMaxValue()
  {
    return GetNumberOfSubIterationsMaxValue_26();
  }

  private native int GetNumberOfSubIterations_27();
  public int GetNumberOfSubIterations()
  {
    return GetNumberOfSubIterations_27();
  }

  private native void SetMaximumStepSize_28(double id0);
  public void SetMaximumStepSize(double id0)
  {
    SetMaximumStepSize_28(id0);
  }

  private native double GetMaximumStepSizeMinValue_29();
  public double GetMaximumStepSizeMinValue()
  {
    return GetMaximumStepSizeMinValue_29();
  }

  private native double GetMaximumStepSizeMaxValue_30();
  public double GetMaximumStepSizeMaxValue()
  {
    return GetMaximumStepSizeMaxValue_30();
  }

  private native double GetMaximumStepSize_31();
  public double GetMaximumStepSize()
  {
    return GetMaximumStepSize_31();
  }

  private native void SetConvergence_32(double id0);
  public void SetConvergence(double id0)
  {
    SetConvergence_32(id0);
  }

  private native double GetConvergenceMinValue_33();
  public double GetConvergenceMinValue()
  {
    return GetConvergenceMinValue_33();
  }

  private native double GetConvergenceMaxValue_34();
  public double GetConvergenceMaxValue()
  {
    return GetConvergenceMaxValue_34();
  }

  private native double GetConvergence_35();
  public double GetConvergence()
  {
    return GetConvergence_35();
  }

  private native void SetEnableConstraints_36(boolean id0);
  public void SetEnableConstraints(boolean id0)
  {
    SetEnableConstraints_36(id0);
  }

  private native boolean GetEnableConstraints_37();
  public boolean GetEnableConstraints()
  {
    return GetEnableConstraints_37();
  }

  private native void EnableConstraintsOn_38();
  public void EnableConstraintsOn()
  {
    EnableConstraintsOn_38();
  }

  private native void EnableConstraintsOff_39();
  public void EnableConstraintsOff()
  {
    EnableConstraintsOff_39();
  }

  private native void SetFixedAngle_40(double id0);
  public void SetFixedAngle(double id0)
  {
    SetFixedAngle_40(id0);
  }

  private native double GetFixedAngleMinValue_41();
  public double GetFixedAngleMinValue()
  {
    return GetFixedAngleMinValue_41();
  }

  private native double GetFixedAngleMaxValue_42();
  public double GetFixedAngleMaxValue()
  {
    return GetFixedAngleMaxValue_42();
  }

  private native double GetFixedAngle_43();
  public double GetFixedAngle()
  {
    return GetFixedAngle_43();
  }

  private native void SetBoundaryAngle_44(double id0);
  public void SetBoundaryAngle(double id0)
  {
    SetBoundaryAngle_44(id0);
  }

  private native double GetBoundaryAngleMinValue_45();
  public double GetBoundaryAngleMinValue()
  {
    return GetBoundaryAngleMinValue_45();
  }

  private native double GetBoundaryAngleMaxValue_46();
  public double GetBoundaryAngleMaxValue()
  {
    return GetBoundaryAngleMaxValue_46();
  }

  private native double GetBoundaryAngle_47();
  public double GetBoundaryAngle()
  {
    return GetBoundaryAngle_47();
  }

  private native void SetGenerateConstraintScalars_48(boolean id0);
  public void SetGenerateConstraintScalars(boolean id0)
  {
    SetGenerateConstraintScalars_48(id0);
  }

  private native boolean GetGenerateConstraintScalars_49();
  public boolean GetGenerateConstraintScalars()
  {
    return GetGenerateConstraintScalars_49();
  }

  private native void GenerateConstraintScalarsOn_50();
  public void GenerateConstraintScalarsOn()
  {
    GenerateConstraintScalarsOn_50();
  }

  private native void GenerateConstraintScalarsOff_51();
  public void GenerateConstraintScalarsOff()
  {
    GenerateConstraintScalarsOff_51();
  }

  private native void SetGenerateConstraintNormals_52(boolean id0);
  public void SetGenerateConstraintNormals(boolean id0)
  {
    SetGenerateConstraintNormals_52(id0);
  }

  private native boolean GetGenerateConstraintNormals_53();
  public boolean GetGenerateConstraintNormals()
  {
    return GetGenerateConstraintNormals_53();
  }

  private native void GenerateConstraintNormalsOn_54();
  public void GenerateConstraintNormalsOn()
  {
    GenerateConstraintNormalsOn_54();
  }

  private native void GenerateConstraintNormalsOff_55();
  public void GenerateConstraintNormalsOff()
  {
    GenerateConstraintNormalsOff_55();
  }

  private native void SetComputePackingRadius_56(boolean id0);
  public void SetComputePackingRadius(boolean id0)
  {
    SetComputePackingRadius_56(id0);
  }

  private native boolean GetComputePackingRadius_57();
  public boolean GetComputePackingRadius()
  {
    return GetComputePackingRadius_57();
  }

  private native void ComputePackingRadiusOn_58();
  public void ComputePackingRadiusOn()
  {
    ComputePackingRadiusOn_58();
  }

  private native void ComputePackingRadiusOff_59();
  public void ComputePackingRadiusOff()
  {
    ComputePackingRadiusOff_59();
  }

  private native void SetPackingRadius_60(double id0);
  public void SetPackingRadius(double id0)
  {
    SetPackingRadius_60(id0);
  }

  private native double GetPackingRadiusMinValue_61();
  public double GetPackingRadiusMinValue()
  {
    return GetPackingRadiusMinValue_61();
  }

  private native double GetPackingRadiusMaxValue_62();
  public double GetPackingRadiusMaxValue()
  {
    return GetPackingRadiusMaxValue_62();
  }

  private native double GetPackingRadius_63();
  public double GetPackingRadius()
  {
    return GetPackingRadius_63();
  }

  private native void SetPackingFactor_64(double id0);
  public void SetPackingFactor(double id0)
  {
    SetPackingFactor_64(id0);
  }

  private native double GetPackingFactorMinValue_65();
  public double GetPackingFactorMinValue()
  {
    return GetPackingFactorMinValue_65();
  }

  private native double GetPackingFactorMaxValue_66();
  public double GetPackingFactorMaxValue()
  {
    return GetPackingFactorMaxValue_66();
  }

  private native double GetPackingFactor_67();
  public double GetPackingFactor()
  {
    return GetPackingFactor_67();
  }

  private native void SetAttractionFactor_68(double id0);
  public void SetAttractionFactor(double id0)
  {
    SetAttractionFactor_68(id0);
  }

  private native double GetAttractionFactorMinValue_69();
  public double GetAttractionFactorMinValue()
  {
    return GetAttractionFactorMinValue_69();
  }

  private native double GetAttractionFactorMaxValue_70();
  public double GetAttractionFactorMaxValue()
  {
    return GetAttractionFactorMaxValue_70();
  }

  private native double GetAttractionFactor_71();
  public double GetAttractionFactor()
  {
    return GetAttractionFactor_71();
  }

  private native void SetMotionConstraint_72(int id0);
  public void SetMotionConstraint(int id0)
  {
    SetMotionConstraint_72(id0);
  }

  private native int GetMotionConstraint_73();
  public int GetMotionConstraint()
  {
    return GetMotionConstraint_73();
  }

  private native void SetMotionConstraintToUnconstrained_74();
  public void SetMotionConstraintToUnconstrained()
  {
    SetMotionConstraintToUnconstrained_74();
  }

  private native void SetMotionConstraintToPlane_75();
  public void SetMotionConstraintToPlane()
  {
    SetMotionConstraintToPlane_75();
  }

  private native void SetPlane_76(vtkPlane id0);
  public void SetPlane(vtkPlane id0)
  {
    SetPlane_76(id0);
  }

  private native long GetPlane_77();
  public vtkPlane GetPlane()
  {
    long temp = GetPlane_77();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLocator_78(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_78(id0);
  }

  private native long GetLocator_79();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_79();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPointSmoothingFilter() { super(); }

  public vtkPointSmoothingFilter(long id) { super(id); }
  public native long   VTKInit();

}
