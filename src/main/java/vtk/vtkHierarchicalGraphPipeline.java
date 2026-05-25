// java wrapper for vtkHierarchicalGraphPipeline object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHierarchicalGraphPipeline extends vtkObject
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

  private native long GetActor_4();
  public vtkActor GetActor()
  {
    long temp = GetActor_4();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabelActor_5();
  public vtkActor2D GetLabelActor()
  {
    long temp = GetLabelActor_5();

    if (temp == 0) return null;
    return (vtkActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBundlingStrength_6(double id0);
  public void SetBundlingStrength(double id0)
  {
    SetBundlingStrength_6(id0);
  }

  private native double GetBundlingStrength_7();
  public double GetBundlingStrength()
  {
    return GetBundlingStrength_7();
  }

  private native void SetLabelArrayName_8(byte[] id0, int len0);
  public void SetLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetLabelArrayName_9();
  public String GetLabelArrayName()
  {
    return new String(GetLabelArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetLabelVisibility_10(boolean id0);
  public void SetLabelVisibility(boolean id0)
  {
    SetLabelVisibility_10(id0);
  }

  private native boolean GetLabelVisibility_11();
  public boolean GetLabelVisibility()
  {
    return GetLabelVisibility_11();
  }

  private native void LabelVisibilityOn_12();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_12();
  }

  private native void LabelVisibilityOff_13();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_13();
  }

  private native void SetLabelTextProperty_14(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_14(id0);
  }

  private native long GetLabelTextProperty_15();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_15();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetColorArrayName_16(byte[] id0, int len0);
  public void SetColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColorArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetColorArrayName_17();
  public String GetColorArrayName()
  {
    return new String(GetColorArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetColorEdgesByArray_18(boolean id0);
  public void SetColorEdgesByArray(boolean id0)
  {
    SetColorEdgesByArray_18(id0);
  }

  private native boolean GetColorEdgesByArray_19();
  public boolean GetColorEdgesByArray()
  {
    return GetColorEdgesByArray_19();
  }

  private native void ColorEdgesByArrayOn_20();
  public void ColorEdgesByArrayOn()
  {
    ColorEdgesByArrayOn_20();
  }

  private native void ColorEdgesByArrayOff_21();
  public void ColorEdgesByArrayOff()
  {
    ColorEdgesByArrayOff_21();
  }

  private native void SetVisibility_22(boolean id0);
  public void SetVisibility(boolean id0)
  {
    SetVisibility_22(id0);
  }

  private native boolean GetVisibility_23();
  public boolean GetVisibility()
  {
    return GetVisibility_23();
  }

  private native void VisibilityOn_24();
  public void VisibilityOn()
  {
    VisibilityOn_24();
  }

  private native void VisibilityOff_25();
  public void VisibilityOff()
  {
    VisibilityOff_25();
  }

  private native long ConvertSelection_26(vtkDataRepresentation id0,vtkSelection id1);
  public vtkSelection ConvertSelection(vtkDataRepresentation id0,vtkSelection id1)
  {
    long temp = ConvertSelection_26(id0,id1);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void PrepareInputConnections_27(vtkAlgorithmOutput id0,vtkAlgorithmOutput id1,vtkAlgorithmOutput id2);
  public void PrepareInputConnections(vtkAlgorithmOutput id0,vtkAlgorithmOutput id1,vtkAlgorithmOutput id2)
  {
    PrepareInputConnections_27(id0,id1,id2);
  }

  private native void ApplyViewTheme_28(vtkViewTheme id0);
  public void ApplyViewTheme(vtkViewTheme id0)
  {
    ApplyViewTheme_28(id0);
  }

  private native void SetHoverArrayName_29(byte[] id0, int len0);
  public void SetHoverArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetHoverArrayName_29(bytes0, bytes0.length);
  }

  private native byte[] GetHoverArrayName_30();
  public String GetHoverArrayName()
  {
    return new String(GetHoverArrayName_30(), StandardCharsets.UTF_8);
  }

  private native void SetSplineType_31(int id0);
  public void SetSplineType(int id0)
  {
    SetSplineType_31(id0);
  }

  private native int GetSplineType_32();
  public int GetSplineType()
  {
    return GetSplineType_32();
  }

  private native void RegisterProgress_33(vtkRenderView id0);
  public void RegisterProgress(vtkRenderView id0)
  {
    RegisterProgress_33(id0);
  }

  public vtkHierarchicalGraphPipeline() { super(); }

  public vtkHierarchicalGraphPipeline(long id) { super(id); }
  public native long   VTKInit();

}
