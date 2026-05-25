// java wrapper for vtkDummyController object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDummyController extends vtkMultiProcessController
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

  private native void Finalize_4();
  public void Finalize()
  {
    Finalize_4();
  }

  private native void Finalize_5(int id0);
  public void Finalize(int id0)
  {
    Finalize_5(id0);
  }

  private native int GetLocalProcessId_6();
  public int GetLocalProcessId()
  {
    return GetLocalProcessId_6();
  }

  private native void SingleMethodExecute_7();
  public void SingleMethodExecute()
  {
    SingleMethodExecute_7();
  }

  private native void MultipleMethodExecute_8();
  public void MultipleMethodExecute()
  {
    MultipleMethodExecute_8();
  }

  private native void CreateOutputWindow_9();
  public void CreateOutputWindow()
  {
    CreateOutputWindow_9();
  }

  private native long GetRMICommunicator_10();
  public vtkCommunicator GetRMICommunicator()
  {
    long temp = GetRMICommunicator_10();

    if (temp == 0) return null;
    return (vtkCommunicator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCommunicator_11(vtkCommunicator id0);
  public void SetCommunicator(vtkCommunicator id0)
  {
    SetCommunicator_11(id0);
  }

  private native void SetRMICommunicator_12(vtkCommunicator id0);
  public void SetRMICommunicator(vtkCommunicator id0)
  {
    SetRMICommunicator_12(id0);
  }

  public vtkDummyController() { super(); }

  public vtkDummyController(long id) { super(id); }
  public native long   VTKInit();

}
