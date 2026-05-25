// java wrapper for vtkClipDataSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkClipDataSet extends vtkUnstructuredGridAlgorithm
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

  private native void SetValue_4(double id0);
  public void SetValue(double id0)
  {
    SetValue_4(id0);
  }

  private native double GetValue_5();
  public double GetValue()
  {
    return GetValue_5();
  }

  private native void SetUseValueAsOffset_6(boolean id0);
  public void SetUseValueAsOffset(boolean id0)
  {
    SetUseValueAsOffset_6(id0);
  }

  private native boolean GetUseValueAsOffset_7();
  public boolean GetUseValueAsOffset()
  {
    return GetUseValueAsOffset_7();
  }

  private native void UseValueAsOffsetOn_8();
  public void UseValueAsOffsetOn()
  {
    UseValueAsOffsetOn_8();
  }

  private native void UseValueAsOffsetOff_9();
  public void UseValueAsOffsetOff()
  {
    UseValueAsOffsetOff_9();
  }

  private native void SetInsideOut_10(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_10(id0);
  }

  private native int GetInsideOut_11();
  public int GetInsideOut()
  {
    return GetInsideOut_11();
  }

  private native void InsideOutOn_12();
  public void InsideOutOn()
  {
    InsideOutOn_12();
  }

  private native void InsideOutOff_13();
  public void InsideOutOff()
  {
    InsideOutOff_13();
  }

  private native void SetClipFunction_14(vtkImplicitFunction id0);
  public void SetClipFunction(vtkImplicitFunction id0)
  {
    SetClipFunction_14(id0);
  }

  private native long GetClipFunction_15();
  public vtkImplicitFunction GetClipFunction()
  {
    long temp = GetClipFunction_15();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateClipScalars_16(int id0);
  public void SetGenerateClipScalars(int id0)
  {
    SetGenerateClipScalars_16(id0);
  }

  private native int GetGenerateClipScalars_17();
  public int GetGenerateClipScalars()
  {
    return GetGenerateClipScalars_17();
  }

  private native void GenerateClipScalarsOn_18();
  public void GenerateClipScalarsOn()
  {
    GenerateClipScalarsOn_18();
  }

  private native void GenerateClipScalarsOff_19();
  public void GenerateClipScalarsOff()
  {
    GenerateClipScalarsOff_19();
  }

  private native void SetGenerateClippedOutput_20(int id0);
  public void SetGenerateClippedOutput(int id0)
  {
    SetGenerateClippedOutput_20(id0);
  }

  private native int GetGenerateClippedOutput_21();
  public int GetGenerateClippedOutput()
  {
    return GetGenerateClippedOutput_21();
  }

  private native void GenerateClippedOutputOn_22();
  public void GenerateClippedOutputOn()
  {
    GenerateClippedOutputOn_22();
  }

  private native void GenerateClippedOutputOff_23();
  public void GenerateClippedOutputOff()
  {
    GenerateClippedOutputOff_23();
  }

  private native void SetMergeTolerance_24(double id0);
  public void SetMergeTolerance(double id0)
  {
    SetMergeTolerance_24(id0);
  }

  private native double GetMergeToleranceMinValue_25();
  public double GetMergeToleranceMinValue()
  {
    return GetMergeToleranceMinValue_25();
  }

  private native double GetMergeToleranceMaxValue_26();
  public double GetMergeToleranceMaxValue()
  {
    return GetMergeToleranceMaxValue_26();
  }

  private native double GetMergeTolerance_27();
  public double GetMergeTolerance()
  {
    return GetMergeTolerance_27();
  }

  private native long GetClippedOutput_28();
  public vtkUnstructuredGrid GetClippedOutput()
  {
    long temp = GetClippedOutput_28();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLocator_29(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_29(id0);
  }

  private native long GetLocator_30();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_30();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_31();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_31();
  }

  private native long GetMTime_32();
  public long GetMTime()
  {
    return GetMTime_32();
  }

  private native void SetOutputPointsPrecision_33(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_33(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_34();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_34();
  }

  private native int GetOutputPointsPrecisionMaxValue_35();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_35();
  }

  private native int GetOutputPointsPrecision_36();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_36();
  }

  private native boolean GetStableClipNonLinear_37();
  public boolean GetStableClipNonLinear()
  {
    return GetStableClipNonLinear_37();
  }

  private native void SetStableClipNonLinear_38(boolean id0);
  public void SetStableClipNonLinear(boolean id0)
  {
    SetStableClipNonLinear_38(id0);
  }

  private native void StableClipNonLinearOn_39();
  public void StableClipNonLinearOn()
  {
    StableClipNonLinearOn_39();
  }

  private native void StableClipNonLinearOff_40();
  public void StableClipNonLinearOff()
  {
    StableClipNonLinearOff_40();
  }

  public vtkClipDataSet() { super(); }

  public vtkClipDataSet(long id) { super(id); }
  public native long   VTKInit();

}
