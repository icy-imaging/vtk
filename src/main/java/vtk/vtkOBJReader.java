// java wrapper for vtkOBJReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOBJReader extends vtkAbstractPolyDataReader
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

  private native byte[] GetComment_4();
  public String GetComment()
  {
    return new String(GetComment_4(), StandardCharsets.UTF_8);
  }

  private native void SetStream_5(vtkResourceStream id0);
  public void SetStream(vtkResourceStream id0)
  {
    SetStream_5(id0);
  }

  private native long GetStream_6();
  public vtkResourceStream GetStream()
  {
    long temp = GetStream_6();

    if (temp == 0) return null;
    return (vtkResourceStream)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkOBJReader() { super(); }

  public vtkOBJReader(long id) { super(id); }
  public native long   VTKInit();

}
