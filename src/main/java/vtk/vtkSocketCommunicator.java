// java wrapper for vtkSocketCommunicator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSocketCommunicator extends vtkCommunicator
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

  private native int WaitForConnection_4(int id0);
  public int WaitForConnection(int id0)
  {
    return WaitForConnection_4(id0);
  }

  private native int WaitForConnection_5(vtkServerSocket id0,long id1);
  public int WaitForConnection(vtkServerSocket id0,long id1)
  {
    return WaitForConnection_5(id0,id1);
  }

  private native void CloseConnection_6();
  public void CloseConnection()
  {
    CloseConnection_6();
  }

  private native int ConnectTo_7(byte[] id0, int len0,int id1);
  public int ConnectTo(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ConnectTo_7(bytes0, bytes0.length,id1);
  }

  private native int GetSwapBytesInReceivedData_8();
  public int GetSwapBytesInReceivedData()
  {
    return GetSwapBytesInReceivedData_8();
  }

  private native int GetIsConnected_9();
  public int GetIsConnected()
  {
    return GetIsConnected_9();
  }

  private native void SetNumberOfProcesses_10(int id0);
  public void SetNumberOfProcesses(int id0)
  {
    SetNumberOfProcesses_10(id0);
  }

  private native void Barrier_11();
  public void Barrier()
  {
    Barrier_11();
  }

  private native void SetPerformHandshake_12(int id0);
  public void SetPerformHandshake(int id0)
  {
    SetPerformHandshake_12(id0);
  }

  private native int GetPerformHandshakeMinValue_13();
  public int GetPerformHandshakeMinValue()
  {
    return GetPerformHandshakeMinValue_13();
  }

  private native int GetPerformHandshakeMaxValue_14();
  public int GetPerformHandshakeMaxValue()
  {
    return GetPerformHandshakeMaxValue_14();
  }

  private native void PerformHandshakeOn_15();
  public void PerformHandshakeOn()
  {
    PerformHandshakeOn_15();
  }

  private native void PerformHandshakeOff_16();
  public void PerformHandshakeOff()
  {
    PerformHandshakeOff_16();
  }

  private native int GetPerformHandshake_17();
  public int GetPerformHandshake()
  {
    return GetPerformHandshake_17();
  }

  private native int LogToFile_18(byte[] id0, int len0);
  public int LogToFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return LogToFile_18(bytes0, bytes0.length);
  }

  private native int LogToFile_19(byte[] id0, int len0,int id1);
  public int LogToFile(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return LogToFile_19(bytes0, bytes0.length,id1);
  }

  private native void SetReportErrors_20(int id0);
  public void SetReportErrors(int id0)
  {
    SetReportErrors_20(id0);
  }

  private native int GetReportErrors_21();
  public int GetReportErrors()
  {
    return GetReportErrors_21();
  }

  private native long GetSocket_22();
  public vtkClientSocket GetSocket()
  {
    long temp = GetSocket_22();

    if (temp == 0) return null;
    return (vtkClientSocket)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSocket_23(vtkClientSocket id0);
  public void SetSocket(vtkClientSocket id0)
  {
    SetSocket_23(id0);
  }

  private native int Handshake_24();
  public int Handshake()
  {
    return Handshake_24();
  }

  private native int ServerSideHandshake_25();
  public int ServerSideHandshake()
  {
    return ServerSideHandshake_25();
  }

  private native int ClientSideHandshake_26();
  public int ClientSideHandshake()
  {
    return ClientSideHandshake_26();
  }

  private native int GetIsServer_27();
  public int GetIsServer()
  {
    return GetIsServer_27();
  }

  private native int GetVersion_28();
  public int GetVersion()
  {
    return GetVersion_28();
  }

  private native void BufferCurrentMessage_29();
  public void BufferCurrentMessage()
  {
    BufferCurrentMessage_29();
  }

  private native boolean HasBufferredMessages_30();
  public boolean HasBufferredMessages()
  {
    return HasBufferredMessages_30();
  }

  public vtkSocketCommunicator() { super(); }

  public vtkSocketCommunicator(long id) { super(id); }
  public native long   VTKInit();

}
