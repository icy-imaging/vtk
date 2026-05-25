// java wrapper for vtkNewickTreeWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNewickTreeWriter extends vtkDataWriter
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

  private native long GetInput_4();
  public vtkTree GetInput()
  {
    long temp = GetInput_4();

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_5(int id0);
  public vtkTree GetInput(int id0)
  {
    long temp = GetInput_5(id0);

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetEdgeWeightArrayName_6();
  public String GetEdgeWeightArrayName()
  {
    return new String(GetEdgeWeightArrayName_6(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeWeightArrayName_7(byte[] id0, int len0);
  public void SetEdgeWeightArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeWeightArrayName_7(bytes0, bytes0.length);
  }

  private native byte[] GetNodeNameArrayName_8();
  public String GetNodeNameArrayName()
  {
    return new String(GetNodeNameArrayName_8(), StandardCharsets.UTF_8);
  }

  private native void SetNodeNameArrayName_9(byte[] id0, int len0);
  public void SetNodeNameArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNodeNameArrayName_9(bytes0, bytes0.length);
  }

  public vtkNewickTreeWriter() { super(); }

  public vtkNewickTreeWriter(long id) { super(id); }
  public native long   VTKInit();

}
