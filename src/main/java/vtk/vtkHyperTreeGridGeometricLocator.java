// java wrapper for vtkHyperTreeGridGeometricLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridGeometricLocator extends vtkHyperTreeGridLocator
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

  private native void SetHTG_4(vtkHyperTreeGrid id0);
  public void SetHTG(vtkHyperTreeGrid id0)
  {
    SetHTG_4(id0);
  }

  private native long Search_5(double id0[]);
  public long Search(double id0[])
  {
    return Search_5(id0);
  }

  private native long Search_6(double id0[],vtkHyperTreeGridNonOrientedGeometryCursor id1);
  public long Search(double id0[],vtkHyperTreeGridNonOrientedGeometryCursor id1)
  {
    return Search_6(id0,id1);
  }

  private native int IntersectWithLine_7(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5)
  {
    return IntersectWithLine_7(id0,id1,id2,id3,id4,id5);
  }

  public vtkHyperTreeGridGeometricLocator() { super(); }

  public vtkHyperTreeGridGeometricLocator(long id) { super(id); }
  public native long   VTKInit();

}
