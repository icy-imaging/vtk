// java wrapper for vtkSocketController object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSocketController extends vtkMultiProcessController
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native void Finalize_5();
  public void Finalize()
  {
    Finalize_5();
  }

  private native void Finalize_6(int id0);
  public void Finalize(int id0)
  {
    Finalize_6(id0);
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

  private native int WaitForConnection_10(int id0);
  public int WaitForConnection(int id0)
  {
    return WaitForConnection_10(id0);
  }

  private native void CloseConnection_11();
  public void CloseConnection()
  {
    CloseConnection_11();
  }

  private native int ConnectTo_12(byte[] id0, int len0,int id1);
  public int ConnectTo(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ConnectTo_12(bytes0, bytes0.length,id1);
  }

  private native int GetSwapBytesInReceivedData_13();
  public int GetSwapBytesInReceivedData()
  {
    return GetSwapBytesInReceivedData_13();
  }

  private native void SetCommunicator_14(vtkSocketCommunicator id0);
  public void SetCommunicator(vtkSocketCommunicator id0)
  {
    SetCommunicator_14(id0);
  }

  private native long CreateCompliantController_15();
  public vtkMultiProcessController CreateCompliantController()
  {
    long temp = CreateCompliantController_15();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkSocketController() { super(); }

  public vtkSocketController(long id) { super(id); }
  public native long   VTKInit();

}
