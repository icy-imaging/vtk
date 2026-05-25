// java wrapper for vtkStackedTreeLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStackedTreeLayoutStrategy extends vtkAreaLayoutStrategy
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

  private native void SetInteriorRadius_6(double id0);
  public void SetInteriorRadius(double id0)
  {
    SetInteriorRadius_6(id0);
  }

  private native double GetInteriorRadius_7();
  public double GetInteriorRadius()
  {
    return GetInteriorRadius_7();
  }

  private native void SetRingThickness_8(double id0);
  public void SetRingThickness(double id0)
  {
    SetRingThickness_8(id0);
  }

  private native double GetRingThickness_9();
  public double GetRingThickness()
  {
    return GetRingThickness_9();
  }

  private native void SetRootStartAngle_10(double id0);
  public void SetRootStartAngle(double id0)
  {
    SetRootStartAngle_10(id0);
  }

  private native double GetRootStartAngle_11();
  public double GetRootStartAngle()
  {
    return GetRootStartAngle_11();
  }

  private native void SetRootEndAngle_12(double id0);
  public void SetRootEndAngle(double id0)
  {
    SetRootEndAngle_12(id0);
  }

  private native double GetRootEndAngle_13();
  public double GetRootEndAngle()
  {
    return GetRootEndAngle_13();
  }

  private native void SetUseRectangularCoordinates_14(boolean id0);
  public void SetUseRectangularCoordinates(boolean id0)
  {
    SetUseRectangularCoordinates_14(id0);
  }

  private native boolean GetUseRectangularCoordinates_15();
  public boolean GetUseRectangularCoordinates()
  {
    return GetUseRectangularCoordinates_15();
  }

  private native void UseRectangularCoordinatesOn_16();
  public void UseRectangularCoordinatesOn()
  {
    UseRectangularCoordinatesOn_16();
  }

  private native void UseRectangularCoordinatesOff_17();
  public void UseRectangularCoordinatesOff()
  {
    UseRectangularCoordinatesOff_17();
  }

  private native void SetReverse_18(boolean id0);
  public void SetReverse(boolean id0)
  {
    SetReverse_18(id0);
  }

  private native boolean GetReverse_19();
  public boolean GetReverse()
  {
    return GetReverse_19();
  }

  private native void ReverseOn_20();
  public void ReverseOn()
  {
    ReverseOn_20();
  }

  private native void ReverseOff_21();
  public void ReverseOff()
  {
    ReverseOff_21();
  }

  private native void SetInteriorLogSpacingValue_22(double id0);
  public void SetInteriorLogSpacingValue(double id0)
  {
    SetInteriorLogSpacingValue_22(id0);
  }

  private native double GetInteriorLogSpacingValue_23();
  public double GetInteriorLogSpacingValue()
  {
    return GetInteriorLogSpacingValue_23();
  }

  private native long FindVertex_24(vtkTree id0,vtkDataArray id1,float id2[]);
  public long FindVertex(vtkTree id0,vtkDataArray id1,float id2[])
  {
    return FindVertex_24(id0,id1,id2);
  }

  public vtkStackedTreeLayoutStrategy() { super(); }

  public vtkStackedTreeLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
