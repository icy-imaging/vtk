// java wrapper for vtkImageSeedConnectivity object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSeedConnectivity extends vtkImageAlgorithm
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

  private native void RemoveAllSeeds_4();
  public void RemoveAllSeeds()
  {
    RemoveAllSeeds_4();
  }

  private native void AddSeed_5(int id0,int id1,int id2);
  public void AddSeed(int id0,int id1,int id2)
  {
    AddSeed_5(id0,id1,id2);
  }

  private native void AddSeed_6(int id0,int id1);
  public void AddSeed(int id0,int id1)
  {
    AddSeed_6(id0,id1);
  }

  private native void SetInputConnectValue_7(byte id0);
  public void SetInputConnectValue(byte id0)
  {
    SetInputConnectValue_7(id0);
  }

  private native byte GetInputConnectValue_8();
  public byte GetInputConnectValue()
  {
    return GetInputConnectValue_8();
  }

  private native void SetOutputConnectedValue_9(byte id0);
  public void SetOutputConnectedValue(byte id0)
  {
    SetOutputConnectedValue_9(id0);
  }

  private native byte GetOutputConnectedValue_10();
  public byte GetOutputConnectedValue()
  {
    return GetOutputConnectedValue_10();
  }

  private native void SetOutputUnconnectedValue_11(byte id0);
  public void SetOutputUnconnectedValue(byte id0)
  {
    SetOutputUnconnectedValue_11(id0);
  }

  private native byte GetOutputUnconnectedValue_12();
  public byte GetOutputUnconnectedValue()
  {
    return GetOutputUnconnectedValue_12();
  }

  private native long GetConnector_13();
  public vtkImageConnector GetConnector()
  {
    long temp = GetConnector_13();

    if (temp == 0) return null;
    return (vtkImageConnector)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDimensionality_14(int id0);
  public void SetDimensionality(int id0)
  {
    SetDimensionality_14(id0);
  }

  private native int GetDimensionality_15();
  public int GetDimensionality()
  {
    return GetDimensionality_15();
  }

  public vtkImageSeedConnectivity() { super(); }

  public vtkImageSeedConnectivity(long id) { super(id); }
  public native long   VTKInit();

}
