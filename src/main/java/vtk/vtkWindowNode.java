// java wrapper for vtkWindowNode object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWindowNode extends vtkViewNode
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

  private native void Build_4(boolean id0);
  public void Build(boolean id0)
  {
    Build_4(id0);
  }

  private native void Synchronize_5(boolean id0);
  public void Synchronize(boolean id0)
  {
    Synchronize_5(id0);
  }

  private native long GetColorBuffer_6();
  public vtkUnsignedCharArray GetColorBuffer()
  {
    long temp = GetColorBuffer_6();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZBuffer_7();
  public vtkFloatArray GetZBuffer()
  {
    long temp = GetZBuffer_7();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkWindowNode() { super(); }

  public vtkWindowNode(long id) { super(id); }
  public native long   VTKInit();

}
