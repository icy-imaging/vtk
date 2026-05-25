// java wrapper for vtkHyperTreeGridLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridLocator extends vtkObject
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

  private native long GetHTG_4();
  public vtkHyperTreeGrid GetHTG()
  {
    long temp = GetHTG_4();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHTG_5(vtkHyperTreeGrid id0);
  public void SetHTG(vtkHyperTreeGrid id0)
  {
    SetHTG_5(id0);
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  private native void Update_7();
  public void Update()
  {
    Update_7();
  }

  private native long Search_8(double id0[]);
  public long Search(double id0[])
  {
    return Search_8(id0);
  }

  private native int IntersectWithLine_9(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5)
  {
    return IntersectWithLine_9(id0,id1,id2,id3,id4,id5);
  }

  private native void SetTolerance_10(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_10(id0);
  }

  private native double GetTolerance_11();
  public double GetTolerance()
  {
    return GetTolerance_11();
  }

  public vtkHyperTreeGridLocator() { super(); }

  public vtkHyperTreeGridLocator(long id) { super(id); }

}
