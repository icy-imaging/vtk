// java wrapper for vtkAreaLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAreaLayoutStrategy extends vtkObject
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

  private native void Layout_4(vtkTree id0,vtkDataArray id1,vtkDataArray id2);
  public void Layout(vtkTree id0,vtkDataArray id1,vtkDataArray id2)
  {
    Layout_4(id0,id1,id2);
  }

  private native void LayoutEdgePoints_5(vtkTree id0,vtkDataArray id1,vtkDataArray id2,vtkTree id3);
  public void LayoutEdgePoints(vtkTree id0,vtkDataArray id1,vtkDataArray id2,vtkTree id3)
  {
    LayoutEdgePoints_5(id0,id1,id2,id3);
  }

  private native long FindVertex_6(vtkTree id0,vtkDataArray id1,float id2[]);
  public long FindVertex(vtkTree id0,vtkDataArray id1,float id2[])
  {
    return FindVertex_6(id0,id1,id2);
  }

  private native void SetShrinkPercentage_7(double id0);
  public void SetShrinkPercentage(double id0)
  {
    SetShrinkPercentage_7(id0);
  }

  private native double GetShrinkPercentageMinValue_8();
  public double GetShrinkPercentageMinValue()
  {
    return GetShrinkPercentageMinValue_8();
  }

  private native double GetShrinkPercentageMaxValue_9();
  public double GetShrinkPercentageMaxValue()
  {
    return GetShrinkPercentageMaxValue_9();
  }

  private native double GetShrinkPercentage_10();
  public double GetShrinkPercentage()
  {
    return GetShrinkPercentage_10();
  }

  public vtkAreaLayoutStrategy() { super(); }

  public vtkAreaLayoutStrategy(long id) { super(id); }

}
