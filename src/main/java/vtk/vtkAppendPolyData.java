// java wrapper for vtkAppendPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAppendPolyData extends vtkPolyDataAlgorithm
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

  private native void SetUserManagedInputs_4(int id0);
  public void SetUserManagedInputs(int id0)
  {
    SetUserManagedInputs_4(id0);
  }

  private native int GetUserManagedInputs_5();
  public int GetUserManagedInputs()
  {
    return GetUserManagedInputs_5();
  }

  private native void UserManagedInputsOn_6();
  public void UserManagedInputsOn()
  {
    UserManagedInputsOn_6();
  }

  private native void UserManagedInputsOff_7();
  public void UserManagedInputsOff()
  {
    UserManagedInputsOff_7();
  }

  private native void AddInputData_8(vtkPolyData id0);
  public void AddInputData(vtkPolyData id0)
  {
    AddInputData_8(id0);
  }

  private native void RemoveInputData_9(vtkPolyData id0);
  public void RemoveInputData(vtkPolyData id0)
  {
    RemoveInputData_9(id0);
  }

  private native long GetInput_10(int id0);
  public vtkPolyData GetInput(int id0)
  {
    long temp = GetInput_10(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_11();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_11();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfInputs_12(int id0);
  public void SetNumberOfInputs(int id0)
  {
    SetNumberOfInputs_12(id0);
  }

  private native void SetInputConnectionByNumber_13(int id0,vtkAlgorithmOutput id1);
  public void SetInputConnectionByNumber(int id0,vtkAlgorithmOutput id1)
  {
    SetInputConnectionByNumber_13(id0,id1);
  }

  private native void SetInputDataByNumber_14(int id0,vtkPolyData id1);
  public void SetInputDataByNumber(int id0,vtkPolyData id1)
  {
    SetInputDataByNumber_14(id0,id1);
  }

  private native void SetParallelStreaming_15(int id0);
  public void SetParallelStreaming(int id0)
  {
    SetParallelStreaming_15(id0);
  }

  private native int GetParallelStreaming_16();
  public int GetParallelStreaming()
  {
    return GetParallelStreaming_16();
  }

  private native void ParallelStreamingOn_17();
  public void ParallelStreamingOn()
  {
    ParallelStreamingOn_17();
  }

  private native void ParallelStreamingOff_18();
  public void ParallelStreamingOff()
  {
    ParallelStreamingOff_18();
  }

  private native void SetOutputPointsPrecision_19(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_19(id0);
  }

  private native int GetOutputPointsPrecision_20();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_20();
  }

  public vtkAppendPolyData() { super(); }

  public vtkAppendPolyData(long id) { super(id); }
  public native long   VTKInit();

}
