// java wrapper for vtkDIMACSGraphReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDIMACSGraphReader extends vtkGraphAlgorithm
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

  private native byte[] GetFileName_4();
  public String GetFileName()
  {
    return new String(GetFileName_4(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetVertexAttributeArrayName_6();
  public String GetVertexAttributeArrayName()
  {
    return new String(GetVertexAttributeArrayName_6(), StandardCharsets.UTF_8);
  }

  private native void SetVertexAttributeArrayName_7(byte[] id0, int len0);
  public void SetVertexAttributeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexAttributeArrayName_7(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeAttributeArrayName_8();
  public String GetEdgeAttributeArrayName()
  {
    return new String(GetEdgeAttributeArrayName_8(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeAttributeArrayName_9(byte[] id0, int len0);
  public void SetEdgeAttributeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeAttributeArrayName_9(bytes0, bytes0.length);
  }

  public vtkDIMACSGraphReader() { super(); }

  public vtkDIMACSGraphReader(long id) { super(id); }
  public native long   VTKInit();

}
