// java wrapper for vtkDataSetEdgeSubdivisionCriterion object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSetEdgeSubdivisionCriterion extends vtkEdgeSubdivisionCriterion
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

  private native void SetMesh_4(vtkDataSet id0);
  public void SetMesh(vtkDataSet id0)
  {
    SetMesh_4(id0);
  }

  private native long GetMesh_5();
  public vtkDataSet GetMesh()
  {
    long temp = GetMesh_5();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCellId_6(long id0);
  public void SetCellId(long id0)
  {
    SetCellId_6(id0);
  }

  private native long GetCellId_7();
  public long GetCellId()
  {
    return GetCellId_7();
  }

  private native long GetCell_8();
  public vtkCell GetCell()
  {
    long temp = GetCell_8();

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetChordError2_9(double id0);
  public void SetChordError2(double id0)
  {
    SetChordError2_9(id0);
  }

  private native double GetChordError2_10();
  public double GetChordError2()
  {
    return GetChordError2_10();
  }

  private native void SetFieldError2_11(int id0,double id1);
  public void SetFieldError2(int id0,double id1)
  {
    SetFieldError2_11(id0,id1);
  }

  private native double GetFieldError2_12(int id0);
  public double GetFieldError2(int id0)
  {
    return GetFieldError2_12(id0);
  }

  private native void ResetFieldError2_13();
  public void ResetFieldError2()
  {
    ResetFieldError2_13();
  }

  private native int GetActiveFieldCriteria_14();
  public int GetActiveFieldCriteria()
  {
    return GetActiveFieldCriteria_14();
  }

  public vtkDataSetEdgeSubdivisionCriterion() { super(); }

  public vtkDataSetEdgeSubdivisionCriterion(long id) { super(id); }
  public native long   VTKInit();

}
