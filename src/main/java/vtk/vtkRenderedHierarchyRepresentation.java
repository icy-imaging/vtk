// java wrapper for vtkRenderedHierarchyRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderedHierarchyRepresentation extends vtkRenderedGraphRepresentation
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

  private native void SetGraphEdgeLabelArrayName_4(byte[] id0, int len0);
  public void SetGraphEdgeLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphEdgeLabelArrayName_4(bytes0, bytes0.length);
  }

  private native void SetGraphEdgeLabelArrayName_5(byte[] id0, int len0,int id1);
  public void SetGraphEdgeLabelArrayName(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphEdgeLabelArrayName_5(bytes0, bytes0.length,id1);
  }

  private native byte[] GetGraphEdgeLabelArrayName_6();
  public String GetGraphEdgeLabelArrayName()
  {
    return new String(GetGraphEdgeLabelArrayName_6(), StandardCharsets.UTF_8);
  }

  private native byte[] GetGraphEdgeLabelArrayName_7(int id0);
  public String GetGraphEdgeLabelArrayName(int id0)
  {
    return new String(GetGraphEdgeLabelArrayName_7(id0), StandardCharsets.UTF_8);
  }

  private native void SetGraphEdgeLabelVisibility_8(boolean id0);
  public void SetGraphEdgeLabelVisibility(boolean id0)
  {
    SetGraphEdgeLabelVisibility_8(id0);
  }

  private native void SetGraphEdgeLabelVisibility_9(boolean id0,int id1);
  public void SetGraphEdgeLabelVisibility(boolean id0,int id1)
  {
    SetGraphEdgeLabelVisibility_9(id0,id1);
  }

  private native boolean GetGraphEdgeLabelVisibility_10();
  public boolean GetGraphEdgeLabelVisibility()
  {
    return GetGraphEdgeLabelVisibility_10();
  }

  private native boolean GetGraphEdgeLabelVisibility_11(int id0);
  public boolean GetGraphEdgeLabelVisibility(int id0)
  {
    return GetGraphEdgeLabelVisibility_11(id0);
  }

  private native void GraphEdgeLabelVisibilityOn_12();
  public void GraphEdgeLabelVisibilityOn()
  {
    GraphEdgeLabelVisibilityOn_12();
  }

  private native void GraphEdgeLabelVisibilityOff_13();
  public void GraphEdgeLabelVisibilityOff()
  {
    GraphEdgeLabelVisibilityOff_13();
  }

  private native void SetGraphEdgeColorArrayName_14(byte[] id0, int len0);
  public void SetGraphEdgeColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphEdgeColorArrayName_14(bytes0, bytes0.length);
  }

  private native void SetGraphEdgeColorArrayName_15(byte[] id0, int len0,int id1);
  public void SetGraphEdgeColorArrayName(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphEdgeColorArrayName_15(bytes0, bytes0.length,id1);
  }

  private native byte[] GetGraphEdgeColorArrayName_16();
  public String GetGraphEdgeColorArrayName()
  {
    return new String(GetGraphEdgeColorArrayName_16(), StandardCharsets.UTF_8);
  }

  private native byte[] GetGraphEdgeColorArrayName_17(int id0);
  public String GetGraphEdgeColorArrayName(int id0)
  {
    return new String(GetGraphEdgeColorArrayName_17(id0), StandardCharsets.UTF_8);
  }

  private native void SetColorGraphEdgesByArray_18(boolean id0);
  public void SetColorGraphEdgesByArray(boolean id0)
  {
    SetColorGraphEdgesByArray_18(id0);
  }

  private native void SetColorGraphEdgesByArray_19(boolean id0,int id1);
  public void SetColorGraphEdgesByArray(boolean id0,int id1)
  {
    SetColorGraphEdgesByArray_19(id0,id1);
  }

  private native boolean GetColorGraphEdgesByArray_20();
  public boolean GetColorGraphEdgesByArray()
  {
    return GetColorGraphEdgesByArray_20();
  }

  private native boolean GetColorGraphEdgesByArray_21(int id0);
  public boolean GetColorGraphEdgesByArray(int id0)
  {
    return GetColorGraphEdgesByArray_21(id0);
  }

  private native void ColorGraphEdgesByArrayOn_22();
  public void ColorGraphEdgesByArrayOn()
  {
    ColorGraphEdgesByArrayOn_22();
  }

  private native void ColorGraphEdgesByArrayOff_23();
  public void ColorGraphEdgesByArrayOff()
  {
    ColorGraphEdgesByArrayOff_23();
  }

  private native void SetGraphEdgeColorToSplineFraction_24();
  public void SetGraphEdgeColorToSplineFraction()
  {
    SetGraphEdgeColorToSplineFraction_24();
  }

  private native void SetGraphEdgeColorToSplineFraction_25(int id0);
  public void SetGraphEdgeColorToSplineFraction(int id0)
  {
    SetGraphEdgeColorToSplineFraction_25(id0);
  }

  private native void SetGraphVisibility_26(boolean id0);
  public void SetGraphVisibility(boolean id0)
  {
    SetGraphVisibility_26(id0);
  }

  private native void SetGraphVisibility_27(boolean id0,int id1);
  public void SetGraphVisibility(boolean id0,int id1)
  {
    SetGraphVisibility_27(id0,id1);
  }

  private native boolean GetGraphVisibility_28();
  public boolean GetGraphVisibility()
  {
    return GetGraphVisibility_28();
  }

  private native boolean GetGraphVisibility_29(int id0);
  public boolean GetGraphVisibility(int id0)
  {
    return GetGraphVisibility_29(id0);
  }

  private native void GraphVisibilityOn_30();
  public void GraphVisibilityOn()
  {
    GraphVisibilityOn_30();
  }

  private native void GraphVisibilityOff_31();
  public void GraphVisibilityOff()
  {
    GraphVisibilityOff_31();
  }

  private native void SetBundlingStrength_32(double id0);
  public void SetBundlingStrength(double id0)
  {
    SetBundlingStrength_32(id0);
  }

  private native void SetBundlingStrength_33(double id0,int id1);
  public void SetBundlingStrength(double id0,int id1)
  {
    SetBundlingStrength_33(id0,id1);
  }

  private native double GetBundlingStrength_34();
  public double GetBundlingStrength()
  {
    return GetBundlingStrength_34();
  }

  private native double GetBundlingStrength_35(int id0);
  public double GetBundlingStrength(int id0)
  {
    return GetBundlingStrength_35(id0);
  }

  private native void SetGraphSplineType_36(int id0,int id1);
  public void SetGraphSplineType(int id0,int id1)
  {
    SetGraphSplineType_36(id0,id1);
  }

  private native int GetGraphSplineType_37(int id0);
  public int GetGraphSplineType(int id0)
  {
    return GetGraphSplineType_37(id0);
  }

  private native void SetGraphEdgeLabelFontSize_38(int id0);
  public void SetGraphEdgeLabelFontSize(int id0)
  {
    SetGraphEdgeLabelFontSize_38(id0);
  }

  private native void SetGraphEdgeLabelFontSize_39(int id0,int id1);
  public void SetGraphEdgeLabelFontSize(int id0,int id1)
  {
    SetGraphEdgeLabelFontSize_39(id0,id1);
  }

  private native int GetGraphEdgeLabelFontSize_40();
  public int GetGraphEdgeLabelFontSize()
  {
    return GetGraphEdgeLabelFontSize_40();
  }

  private native int GetGraphEdgeLabelFontSize_41(int id0);
  public int GetGraphEdgeLabelFontSize(int id0)
  {
    return GetGraphEdgeLabelFontSize_41(id0);
  }

  public vtkRenderedHierarchyRepresentation() { super(); }

  public vtkRenderedHierarchyRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
