// java wrapper for vtkClipPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkClipPolyData extends vtkPolyDataAlgorithm
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

  private native void SetInsideOut_6(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_6(id0);
  }

  private native int GetInsideOut_7();
  public int GetInsideOut()
  {
    return GetInsideOut_7();
  }

  private native void InsideOutOn_8();
  public void InsideOutOn()
  {
    InsideOutOn_8();
  }

  private native void InsideOutOff_9();
  public void InsideOutOff()
  {
    InsideOutOff_9();
  }

  private native void SetClipFunction_10(vtkImplicitFunction id0);
  public void SetClipFunction(vtkImplicitFunction id0)
  {
    SetClipFunction_10(id0);
  }

  private native long GetClipFunction_11();
  public vtkImplicitFunction GetClipFunction()
  {
    long temp = GetClipFunction_11();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateClipScalars_12(int id0);
  public void SetGenerateClipScalars(int id0)
  {
    SetGenerateClipScalars_12(id0);
  }

  private native int GetGenerateClipScalars_13();
  public int GetGenerateClipScalars()
  {
    return GetGenerateClipScalars_13();
  }

  private native void GenerateClipScalarsOn_14();
  public void GenerateClipScalarsOn()
  {
    GenerateClipScalarsOn_14();
  }

  private native void GenerateClipScalarsOff_15();
  public void GenerateClipScalarsOff()
  {
    GenerateClipScalarsOff_15();
  }

  private native void SetGenerateClippedOutput_16(int id0);
  public void SetGenerateClippedOutput(int id0)
  {
    SetGenerateClippedOutput_16(id0);
  }

  private native int GetGenerateClippedOutput_17();
  public int GetGenerateClippedOutput()
  {
    return GetGenerateClippedOutput_17();
  }

  private native void GenerateClippedOutputOn_18();
  public void GenerateClippedOutputOn()
  {
    GenerateClippedOutputOn_18();
  }

  private native void GenerateClippedOutputOff_19();
  public void GenerateClippedOutputOff()
  {
    GenerateClippedOutputOff_19();
  }

  private native long GetClippedOutput_20();
  public vtkPolyData GetClippedOutput()
  {
    long temp = GetClippedOutput_20();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetClippedOutputPort_21();
  public vtkAlgorithmOutput GetClippedOutputPort()
  {
    long temp = GetClippedOutputPort_21();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLocator_22(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_22(id0);
  }

  private native long GetLocator_23();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_23();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_24();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_24();
  }

  private native long GetMTime_25();
  public long GetMTime()
  {
    return GetMTime_25();
  }

  private native void SetOutputPointsPrecision_26(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_26(id0);
  }

  private native int GetOutputPointsPrecision_27();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_27();
  }

  public vtkClipPolyData() { super(); }

  public vtkClipPolyData(long id) { super(id); }
  public native long   VTKInit();

}
