// java wrapper for vtkServerSocket object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkServerSocket extends vtkSocket
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

  private native int CreateServer_4(int id0,byte[] id1, int len1);
  public int CreateServer(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return CreateServer_4(id0,bytes1, bytes1.length);
  }

  private native int CreateServer_5(int id0);
  public int CreateServer(int id0)
  {
    return CreateServer_5(id0);
  }

  private native long WaitForConnection_6(long id0);
  public vtkClientSocket WaitForConnection(long id0)
  {
    long temp = WaitForConnection_6(id0);

    if (temp == 0) return null;
    return (vtkClientSocket)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetServerPort_7();
  public int GetServerPort()
  {
    return GetServerPort_7();
  }

  public vtkServerSocket() { super(); }

  public vtkServerSocket(long id) { super(id); }
  public native long   VTKInit();

}
