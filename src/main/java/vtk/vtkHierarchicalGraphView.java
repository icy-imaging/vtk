// java wrapper for vtkHierarchicalGraphView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHierarchicalGraphView extends vtkGraphLayoutView
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

  private native long SetHierarchyFromInputConnection_4(vtkAlgorithmOutput id0);
  public vtkDataRepresentation SetHierarchyFromInputConnection(vtkAlgorithmOutput id0)
  {
    long temp = SetHierarchyFromInputConnection_4(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SetHierarchyFromInput_5(vtkDataObject id0);
  public vtkDataRepresentation SetHierarchyFromInput(vtkDataObject id0)
  {
    long temp = SetHierarchyFromInput_5(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SetGraphFromInputConnection_6(vtkAlgorithmOutput id0);
  public vtkDataRepresentation SetGraphFromInputConnection(vtkAlgorithmOutput id0)
  {
    long temp = SetGraphFromInputConnection_6(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SetGraphFromInput_7(vtkDataObject id0);
  public vtkDataRepresentation SetGraphFromInput(vtkDataObject id0)
  {
    long temp = SetGraphFromInput_7(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGraphEdgeLabelArrayName_8(byte[] id0, int len0);
  public void SetGraphEdgeLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphEdgeLabelArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetGraphEdgeLabelArrayName_9();
  public String GetGraphEdgeLabelArrayName()
  {
    return new String(GetGraphEdgeLabelArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetGraphEdgeLabelVisibility_10(boolean id0);
  public void SetGraphEdgeLabelVisibility(boolean id0)
  {
    SetGraphEdgeLabelVisibility_10(id0);
  }

  private native boolean GetGraphEdgeLabelVisibility_11();
  public boolean GetGraphEdgeLabelVisibility()
  {
    return GetGraphEdgeLabelVisibility_11();
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

  private native byte[] GetGraphEdgeColorArrayName_15();
  public String GetGraphEdgeColorArrayName()
  {
    return new String(GetGraphEdgeColorArrayName_15(), StandardCharsets.UTF_8);
  }

  private native void SetGraphEdgeColorToSplineFraction_16();
  public void SetGraphEdgeColorToSplineFraction()
  {
    SetGraphEdgeColorToSplineFraction_16();
  }

  private native void SetColorGraphEdgesByArray_17(boolean id0);
  public void SetColorGraphEdgesByArray(boolean id0)
  {
    SetColorGraphEdgesByArray_17(id0);
  }

  private native boolean GetColorGraphEdgesByArray_18();
  public boolean GetColorGraphEdgesByArray()
  {
    return GetColorGraphEdgesByArray_18();
  }

  private native void ColorGraphEdgesByArrayOn_19();
  public void ColorGraphEdgesByArrayOn()
  {
    ColorGraphEdgesByArrayOn_19();
  }

  private native void ColorGraphEdgesByArrayOff_20();
  public void ColorGraphEdgesByArrayOff()
  {
    ColorGraphEdgesByArrayOff_20();
  }

  private native void SetBundlingStrength_21(double id0);
  public void SetBundlingStrength(double id0)
  {
    SetBundlingStrength_21(id0);
  }

  private native double GetBundlingStrength_22();
  public double GetBundlingStrength()
  {
    return GetBundlingStrength_22();
  }

  private native void SetGraphVisibility_23(boolean id0);
  public void SetGraphVisibility(boolean id0)
  {
    SetGraphVisibility_23(id0);
  }

  private native boolean GetGraphVisibility_24();
  public boolean GetGraphVisibility()
  {
    return GetGraphVisibility_24();
  }

  private native void GraphVisibilityOn_25();
  public void GraphVisibilityOn()
  {
    GraphVisibilityOn_25();
  }

  private native void GraphVisibilityOff_26();
  public void GraphVisibilityOff()
  {
    GraphVisibilityOff_26();
  }

  private native void SetGraphEdgeLabelFontSize_27(int id0);
  public void SetGraphEdgeLabelFontSize(int id0)
  {
    SetGraphEdgeLabelFontSize_27(id0);
  }

  private native int GetGraphEdgeLabelFontSize_28();
  public int GetGraphEdgeLabelFontSize()
  {
    return GetGraphEdgeLabelFontSize_28();
  }

  public vtkHierarchicalGraphView() { super(); }

  public vtkHierarchicalGraphView(long id) { super(id); }
  public native long   VTKInit();

}
