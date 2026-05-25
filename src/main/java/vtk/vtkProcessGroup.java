// java wrapper for vtkProcessGroup object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProcessGroup extends vtkObject
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

  private native void Initialize_4(vtkMultiProcessController id0);
  public void Initialize(vtkMultiProcessController id0)
  {
    Initialize_4(id0);
  }

  private native void Initialize_5(vtkCommunicator id0);
  public void Initialize(vtkCommunicator id0)
  {
    Initialize_5(id0);
  }

  private native long GetCommunicator_6();
  public vtkCommunicator GetCommunicator()
  {
    long temp = GetCommunicator_6();

    if (temp == 0) return null;
    return (vtkCommunicator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCommunicator_7(vtkCommunicator id0);
  public void SetCommunicator(vtkCommunicator id0)
  {
    SetCommunicator_7(id0);
  }

  private native int GetNumberOfProcessIds_8();
  public int GetNumberOfProcessIds()
  {
    return GetNumberOfProcessIds_8();
  }

  private native int GetProcessId_9(int id0);
  public int GetProcessId(int id0)
  {
    return GetProcessId_9(id0);
  }

  private native int GetLocalProcessId_10();
  public int GetLocalProcessId()
  {
    return GetLocalProcessId_10();
  }

  private native int FindProcessId_11(int id0);
  public int FindProcessId(int id0)
  {
    return FindProcessId_11(id0);
  }

  private native int AddProcessId_12(int id0);
  public int AddProcessId(int id0)
  {
    return AddProcessId_12(id0);
  }

  private native int RemoveProcessId_13(int id0);
  public int RemoveProcessId(int id0)
  {
    return RemoveProcessId_13(id0);
  }

  private native void RemoveAllProcessIds_14();
  public void RemoveAllProcessIds()
  {
    RemoveAllProcessIds_14();
  }

  private native void Copy_15(vtkProcessGroup id0);
  public void Copy(vtkProcessGroup id0)
  {
    Copy_15(id0);
  }

  public vtkProcessGroup() { super(); }

  public vtkProcessGroup(long id) { super(id); }
  public native long   VTKInit();

}
