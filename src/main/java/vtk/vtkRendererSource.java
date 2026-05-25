// java wrapper for vtkRendererSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRendererSource extends vtkAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetInput_5(vtkRenderer id0);
  public void SetInput(vtkRenderer id0)
  {
    SetInput_5(id0);
  }

  private native long GetInput_6();
  public vtkRenderer GetInput()
  {
    long temp = GetInput_6();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWholeWindow_7(int id0);
  public void SetWholeWindow(int id0)
  {
    SetWholeWindow_7(id0);
  }

  private native int GetWholeWindow_8();
  public int GetWholeWindow()
  {
    return GetWholeWindow_8();
  }

  private native void WholeWindowOn_9();
  public void WholeWindowOn()
  {
    WholeWindowOn_9();
  }

  private native void WholeWindowOff_10();
  public void WholeWindowOff()
  {
    WholeWindowOff_10();
  }

  private native void SetRenderFlag_11(int id0);
  public void SetRenderFlag(int id0)
  {
    SetRenderFlag_11(id0);
  }

  private native int GetRenderFlag_12();
  public int GetRenderFlag()
  {
    return GetRenderFlag_12();
  }

  private native void RenderFlagOn_13();
  public void RenderFlagOn()
  {
    RenderFlagOn_13();
  }

  private native void RenderFlagOff_14();
  public void RenderFlagOff()
  {
    RenderFlagOff_14();
  }

  private native void SetDepthValues_15(int id0);
  public void SetDepthValues(int id0)
  {
    SetDepthValues_15(id0);
  }

  private native int GetDepthValues_16();
  public int GetDepthValues()
  {
    return GetDepthValues_16();
  }

  private native void DepthValuesOn_17();
  public void DepthValuesOn()
  {
    DepthValuesOn_17();
  }

  private native void DepthValuesOff_18();
  public void DepthValuesOff()
  {
    DepthValuesOff_18();
  }

  private native void SetDepthValuesInScalars_19(int id0);
  public void SetDepthValuesInScalars(int id0)
  {
    SetDepthValuesInScalars_19(id0);
  }

  private native int GetDepthValuesInScalars_20();
  public int GetDepthValuesInScalars()
  {
    return GetDepthValuesInScalars_20();
  }

  private native void DepthValuesInScalarsOn_21();
  public void DepthValuesInScalarsOn()
  {
    DepthValuesInScalarsOn_21();
  }

  private native void DepthValuesInScalarsOff_22();
  public void DepthValuesInScalarsOff()
  {
    DepthValuesInScalarsOff_22();
  }

  private native void SetDepthValuesOnly_23(int id0);
  public void SetDepthValuesOnly(int id0)
  {
    SetDepthValuesOnly_23(id0);
  }

  private native int GetDepthValuesOnly_24();
  public int GetDepthValuesOnly()
  {
    return GetDepthValuesOnly_24();
  }

  private native void DepthValuesOnlyOn_25();
  public void DepthValuesOnlyOn()
  {
    DepthValuesOnlyOn_25();
  }

  private native void DepthValuesOnlyOff_26();
  public void DepthValuesOnlyOff()
  {
    DepthValuesOnlyOff_26();
  }

  private native long GetOutput_27();
  public vtkImageData GetOutput()
  {
    long temp = GetOutput_27();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkRendererSource() { super(); }

  public vtkRendererSource(long id) { super(id); }
  public native long   VTKInit();

}
