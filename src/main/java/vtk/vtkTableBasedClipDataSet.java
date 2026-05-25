// java wrapper for vtkTableBasedClipDataSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTableBasedClipDataSet extends vtkUnstructuredGridAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetInsideOut_5(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_5(id0);
  }

  private native int GetInsideOut_6();
  public int GetInsideOut()
  {
    return GetInsideOut_6();
  }

  private native void InsideOutOn_7();
  public void InsideOutOn()
  {
    InsideOutOn_7();
  }

  private native void InsideOutOff_8();
  public void InsideOutOff()
  {
    InsideOutOff_8();
  }

  private native void SetValue_9(double id0);
  public void SetValue(double id0)
  {
    SetValue_9(id0);
  }

  private native double GetValue_10();
  public double GetValue()
  {
    return GetValue_10();
  }

  private native void SetUseValueAsOffset_11(boolean id0);
  public void SetUseValueAsOffset(boolean id0)
  {
    SetUseValueAsOffset_11(id0);
  }

  private native boolean GetUseValueAsOffset_12();
  public boolean GetUseValueAsOffset()
  {
    return GetUseValueAsOffset_12();
  }

  private native void UseValueAsOffsetOn_13();
  public void UseValueAsOffsetOn()
  {
    UseValueAsOffsetOn_13();
  }

  private native void UseValueAsOffsetOff_14();
  public void UseValueAsOffsetOff()
  {
    UseValueAsOffsetOff_14();
  }

  private native void SetClipFunction_15(vtkImplicitFunction id0);
  public void SetClipFunction(vtkImplicitFunction id0)
  {
    SetClipFunction_15(id0);
  }

  private native long GetClipFunction_16();
  public vtkImplicitFunction GetClipFunction()
  {
    long temp = GetClipFunction_16();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateClipScalars_17(int id0);
  public void SetGenerateClipScalars(int id0)
  {
    SetGenerateClipScalars_17(id0);
  }

  private native int GetGenerateClipScalars_18();
  public int GetGenerateClipScalars()
  {
    return GetGenerateClipScalars_18();
  }

  private native void GenerateClipScalarsOn_19();
  public void GenerateClipScalarsOn()
  {
    GenerateClipScalarsOn_19();
  }

  private native void GenerateClipScalarsOff_20();
  public void GenerateClipScalarsOff()
  {
    GenerateClipScalarsOff_20();
  }

  private native void SetMergeTolerance_21(double id0);
  public void SetMergeTolerance(double id0)
  {
    SetMergeTolerance_21(id0);
  }

  private native double GetMergeToleranceMinValue_22();
  public double GetMergeToleranceMinValue()
  {
    return GetMergeToleranceMinValue_22();
  }

  private native double GetMergeToleranceMaxValue_23();
  public double GetMergeToleranceMaxValue()
  {
    return GetMergeToleranceMaxValue_23();
  }

  private native double GetMergeTolerance_24();
  public double GetMergeTolerance()
  {
    return GetMergeTolerance_24();
  }

  private native void SetGenerateClippedOutput_25(int id0);
  public void SetGenerateClippedOutput(int id0)
  {
    SetGenerateClippedOutput_25(id0);
  }

  private native int GetGenerateClippedOutput_26();
  public int GetGenerateClippedOutput()
  {
    return GetGenerateClippedOutput_26();
  }

  private native void GenerateClippedOutputOn_27();
  public void GenerateClippedOutputOn()
  {
    GenerateClippedOutputOn_27();
  }

  private native void GenerateClippedOutputOff_28();
  public void GenerateClippedOutputOff()
  {
    GenerateClippedOutputOff_28();
  }

  private native long GetClippedOutput_29();
  public vtkUnstructuredGrid GetClippedOutput()
  {
    long temp = GetClippedOutput_29();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputPointsPrecision_30(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_30(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_31();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_31();
  }

  private native int GetOutputPointsPrecisionMaxValue_32();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_32();
  }

  private native int GetOutputPointsPrecision_33();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_33();
  }

  private native void SetBatchSize_34(int id0);
  public void SetBatchSize(int id0)
  {
    SetBatchSize_34(id0);
  }

  private native int GetBatchSizeMinValue_35();
  public int GetBatchSizeMinValue()
  {
    return GetBatchSizeMinValue_35();
  }

  private native int GetBatchSizeMaxValue_36();
  public int GetBatchSizeMaxValue()
  {
    return GetBatchSizeMaxValue_36();
  }

  private native int GetBatchSize_37();
  public int GetBatchSize()
  {
    return GetBatchSize_37();
  }

  private native void SetLocator_38(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_38(id0);
  }

  private native long GetLocator_39();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_39();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkTableBasedClipDataSet() { super(); }

  public vtkTableBasedClipDataSet(long id) { super(id); }
  public native long   VTKInit();

}
