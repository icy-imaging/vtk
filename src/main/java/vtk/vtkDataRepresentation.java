// java wrapper for vtkDataRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataRepresentation extends vtkPassInputTypeAlgorithm
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

  private native long GetInputConnection_4(int id0,int id1);
  public vtkAlgorithmOutput GetInputConnection(int id0,int id1)
  {
    long temp = GetInputConnection_4(id0,id1);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAnnotationLink_5();
  public vtkAnnotationLink GetAnnotationLink()
  {
    long temp = GetAnnotationLink_5();

    if (temp == 0) return null;
    return (vtkAnnotationLink)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAnnotationLink_6(vtkAnnotationLink id0);
  public void SetAnnotationLink(vtkAnnotationLink id0)
  {
    SetAnnotationLink_6(id0);
  }

  private native void ApplyViewTheme_7(vtkViewTheme id0);
  public void ApplyViewTheme(vtkViewTheme id0)
  {
    ApplyViewTheme_7(id0);
  }

  private native void Select_8(vtkView id0,vtkSelection id1);
  public void Select(vtkView id0,vtkSelection id1)
  {
    Select_8(id0,id1);
  }

  private native void Select_9(vtkView id0,vtkSelection id1,boolean id2);
  public void Select(vtkView id0,vtkSelection id1,boolean id2)
  {
    Select_9(id0,id1,id2);
  }

  private native void Annotate_10(vtkView id0,vtkAnnotationLayers id1);
  public void Annotate(vtkView id0,vtkAnnotationLayers id1)
  {
    Annotate_10(id0,id1);
  }

  private native void Annotate_11(vtkView id0,vtkAnnotationLayers id1,boolean id2);
  public void Annotate(vtkView id0,vtkAnnotationLayers id1,boolean id2)
  {
    Annotate_11(id0,id1,id2);
  }

  private native void SetSelectable_12(boolean id0);
  public void SetSelectable(boolean id0)
  {
    SetSelectable_12(id0);
  }

  private native boolean GetSelectable_13();
  public boolean GetSelectable()
  {
    return GetSelectable_13();
  }

  private native void SelectableOn_14();
  public void SelectableOn()
  {
    SelectableOn_14();
  }

  private native void SelectableOff_15();
  public void SelectableOff()
  {
    SelectableOff_15();
  }

  private native void UpdateSelection_16(vtkSelection id0);
  public void UpdateSelection(vtkSelection id0)
  {
    UpdateSelection_16(id0);
  }

  private native void UpdateSelection_17(vtkSelection id0,boolean id1);
  public void UpdateSelection(vtkSelection id0,boolean id1)
  {
    UpdateSelection_17(id0,id1);
  }

  private native void UpdateAnnotations_18(vtkAnnotationLayers id0);
  public void UpdateAnnotations(vtkAnnotationLayers id0)
  {
    UpdateAnnotations_18(id0);
  }

  private native void UpdateAnnotations_19(vtkAnnotationLayers id0,boolean id1);
  public void UpdateAnnotations(vtkAnnotationLayers id0,boolean id1)
  {
    UpdateAnnotations_19(id0,id1);
  }

  private native long GetInternalAnnotationOutputPort_20();
  public vtkAlgorithmOutput GetInternalAnnotationOutputPort()
  {
    long temp = GetInternalAnnotationOutputPort_20();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalAnnotationOutputPort_21(int id0);
  public vtkAlgorithmOutput GetInternalAnnotationOutputPort(int id0)
  {
    long temp = GetInternalAnnotationOutputPort_21(id0);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalAnnotationOutputPort_22(int id0,int id1);
  public vtkAlgorithmOutput GetInternalAnnotationOutputPort(int id0,int id1)
  {
    long temp = GetInternalAnnotationOutputPort_22(id0,id1);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalSelectionOutputPort_23();
  public vtkAlgorithmOutput GetInternalSelectionOutputPort()
  {
    long temp = GetInternalSelectionOutputPort_23();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalSelectionOutputPort_24(int id0);
  public vtkAlgorithmOutput GetInternalSelectionOutputPort(int id0)
  {
    long temp = GetInternalSelectionOutputPort_24(id0);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalSelectionOutputPort_25(int id0,int id1);
  public vtkAlgorithmOutput GetInternalSelectionOutputPort(int id0,int id1)
  {
    long temp = GetInternalSelectionOutputPort_25(id0,id1);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalOutputPort_26();
  public vtkAlgorithmOutput GetInternalOutputPort()
  {
    long temp = GetInternalOutputPort_26();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalOutputPort_27(int id0);
  public vtkAlgorithmOutput GetInternalOutputPort(int id0)
  {
    long temp = GetInternalOutputPort_27(id0);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalOutputPort_28(int id0,int id1);
  public vtkAlgorithmOutput GetInternalOutputPort(int id0,int id1)
  {
    long temp = GetInternalOutputPort_28(id0,id1);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionType_29(int id0);
  public void SetSelectionType(int id0)
  {
    SetSelectionType_29(id0);
  }

  private native int GetSelectionType_30();
  public int GetSelectionType()
  {
    return GetSelectionType_30();
  }

  private native void SetSelectionArrayNames_31(vtkStringArray id0);
  public void SetSelectionArrayNames(vtkStringArray id0)
  {
    SetSelectionArrayNames_31(id0);
  }

  private native long GetSelectionArrayNames_32();
  public vtkStringArray GetSelectionArrayNames()
  {
    long temp = GetSelectionArrayNames_32();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionArrayName_33(byte[] id0, int len0);
  public void SetSelectionArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSelectionArrayName_33(bytes0, bytes0.length);
  }

  private native byte[] GetSelectionArrayName_34();
  public String GetSelectionArrayName()
  {
    return new String(GetSelectionArrayName_34(), StandardCharsets.UTF_8);
  }

  private native long ConvertSelection_35(vtkView id0,vtkSelection id1);
  public vtkSelection ConvertSelection(vtkView id0,vtkSelection id1)
  {
    long temp = ConvertSelection_35(id0,id1);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDataRepresentation() { super(); }

  public vtkDataRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
