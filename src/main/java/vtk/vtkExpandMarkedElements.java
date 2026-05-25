// java wrapper for vtkExpandMarkedElements object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExpandMarkedElements extends vtkPassInputTypeAlgorithm
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

  private native void SetNumberOfLayers_4(int id0);
  public void SetNumberOfLayers(int id0)
  {
    SetNumberOfLayers_4(id0);
  }

  private native int GetNumberOfLayersMinValue_5();
  public int GetNumberOfLayersMinValue()
  {
    return GetNumberOfLayersMinValue_5();
  }

  private native int GetNumberOfLayersMaxValue_6();
  public int GetNumberOfLayersMaxValue()
  {
    return GetNumberOfLayersMaxValue_6();
  }

  private native int GetNumberOfLayers_7();
  public int GetNumberOfLayers()
  {
    return GetNumberOfLayers_7();
  }

  private native void SetRemoveSeed_8(boolean id0);
  public void SetRemoveSeed(boolean id0)
  {
    SetRemoveSeed_8(id0);
  }

  private native boolean GetRemoveSeed_9();
  public boolean GetRemoveSeed()
  {
    return GetRemoveSeed_9();
  }

  private native void RemoveSeedOn_10();
  public void RemoveSeedOn()
  {
    RemoveSeedOn_10();
  }

  private native void RemoveSeedOff_11();
  public void RemoveSeedOff()
  {
    RemoveSeedOff_11();
  }

  private native void SetRemoveIntermediateLayers_12(boolean id0);
  public void SetRemoveIntermediateLayers(boolean id0)
  {
    SetRemoveIntermediateLayers_12(id0);
  }

  private native boolean GetRemoveIntermediateLayers_13();
  public boolean GetRemoveIntermediateLayers()
  {
    return GetRemoveIntermediateLayers_13();
  }

  private native void RemoveIntermediateLayersOn_14();
  public void RemoveIntermediateLayersOn()
  {
    RemoveIntermediateLayersOn_14();
  }

  private native void RemoveIntermediateLayersOff_15();
  public void RemoveIntermediateLayersOff()
  {
    RemoveIntermediateLayersOff_15();
  }

  public vtkExpandMarkedElements() { super(); }

  public vtkExpandMarkedElements(long id) { super(id); }
  public native long   VTKInit();

}
