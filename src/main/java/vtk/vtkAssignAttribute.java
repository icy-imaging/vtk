// java wrapper for vtkAssignAttribute object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAssignAttribute extends vtkPassInputTypeAlgorithm
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

  private native void Assign_4(int id0,int id1,int id2);
  public void Assign(int id0,int id1,int id2)
  {
    Assign_4(id0,id1,id2);
  }

  private native void Assign_5(byte[] id0, int len0,int id1,int id2);
  public void Assign(String id0,int id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    Assign_5(bytes0, bytes0.length,id1,id2);
  }

  private native void Assign_6(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public void Assign(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    Assign_6(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  public vtkAssignAttribute() { super(); }

  public vtkAssignAttribute(long id) { super(id); }
  public native long   VTKInit();

}
