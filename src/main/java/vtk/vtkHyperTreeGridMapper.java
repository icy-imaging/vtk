// java wrapper for vtkHyperTreeGridMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridMapper extends vtkMapper
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

  private native void SetInputDataObject_4(int id0,vtkDataObject id1);
  public void SetInputDataObject(int id0,vtkDataObject id1)
  {
    SetInputDataObject_4(id0,id1);
  }

  private native void SetInputDataObject_5(vtkDataObject id0);
  public void SetInputDataObject(vtkDataObject id0)
  {
    SetInputDataObject_5(id0);
  }

  private native void GetBounds_6(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_6(id0);
  }

  private native void GetBoundsComposite_7(double id0[]);
  public void GetBoundsComposite(double id0[])
  {
    GetBoundsComposite_7(id0);
  }

  private native boolean GetUseAdaptiveDecimation_8();
  public boolean GetUseAdaptiveDecimation()
  {
    return GetUseAdaptiveDecimation_8();
  }

  private native void SetUseAdaptiveDecimation_9(boolean id0);
  public void SetUseAdaptiveDecimation(boolean id0)
  {
    SetUseAdaptiveDecimation_9(id0);
  }

  private native void UseAdaptiveDecimationOn_10();
  public void UseAdaptiveDecimationOn()
  {
    UseAdaptiveDecimationOn_10();
  }

  private native void UseAdaptiveDecimationOff_11();
  public void UseAdaptiveDecimationOff()
  {
    UseAdaptiveDecimationOff_11();
  }

  private native void SetCompositeDataDisplayAttributes_12(vtkCompositeDataDisplayAttributes id0);
  public void SetCompositeDataDisplayAttributes(vtkCompositeDataDisplayAttributes id0)
  {
    SetCompositeDataDisplayAttributes_12(id0);
  }

  private native long GetCompositeDataDisplayAttributes_13();
  public vtkCompositeDataDisplayAttributes GetCompositeDataDisplayAttributes()
  {
    long temp = GetCompositeDataDisplayAttributes_13();

    if (temp == 0) return null;
    return (vtkCompositeDataDisplayAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBlockVisibility_14(int id0,boolean id1);
  public void SetBlockVisibility(int id0,boolean id1)
  {
    SetBlockVisibility_14(id0,id1);
  }

  private native boolean GetBlockVisibility_15(int id0);
  public boolean GetBlockVisibility(int id0)
  {
    return GetBlockVisibility_15(id0);
  }

  private native void RemoveBlockVisibility_16(int id0);
  public void RemoveBlockVisibility(int id0)
  {
    RemoveBlockVisibility_16(id0);
  }

  private native void RemoveBlockVisibilities_17();
  public void RemoveBlockVisibilities()
  {
    RemoveBlockVisibilities_17();
  }

  private native void Render_18(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_18(id0,id1);
  }

  private native int FillInputPortInformation_19(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_19(id0,id1);
  }

  private native void SetInputConnection_20(int id0,vtkAlgorithmOutput id1);
  public void SetInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    SetInputConnection_20(id0,id1);
  }

  private native void SetInputConnection_21(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_21(id0);
  }

  public vtkHyperTreeGridMapper() { super(); }

  public vtkHyperTreeGridMapper(long id) { super(id); }
  public native long   VTKInit();

}
