// java wrapper for vtkEdgeSubdivisionCriterion object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEdgeSubdivisionCriterion extends vtkObject
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

  private native int PassField_4(int id0,int id1,vtkStreamingTessellator id2);
  public int PassField(int id0,int id1,vtkStreamingTessellator id2)
  {
    return PassField_4(id0,id1,id2);
  }

  private native void ResetFieldList_5();
  public void ResetFieldList()
  {
    ResetFieldList_5();
  }

  private native boolean DontPassField_6(int id0,vtkStreamingTessellator id1);
  public boolean DontPassField(int id0,vtkStreamingTessellator id1)
  {
    return DontPassField_6(id0,id1);
  }

  private native int GetOutputField_7(int id0);
  public int GetOutputField(int id0)
  {
    return GetOutputField_7(id0);
  }

  private native int GetNumberOfFields_8();
  public int GetNumberOfFields()
  {
    return GetNumberOfFields_8();
  }

  public vtkEdgeSubdivisionCriterion() { super(); }

  public vtkEdgeSubdivisionCriterion(long id) { super(id); }

}
