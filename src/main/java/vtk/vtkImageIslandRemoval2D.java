// java wrapper for vtkImageIslandRemoval2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageIslandRemoval2D extends vtkImageAlgorithm
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

  private native void SetAreaThreshold_4(int id0);
  public void SetAreaThreshold(int id0)
  {
    SetAreaThreshold_4(id0);
  }

  private native int GetAreaThreshold_5();
  public int GetAreaThreshold()
  {
    return GetAreaThreshold_5();
  }

  private native void SetSquareNeighborhood_6(int id0);
  public void SetSquareNeighborhood(int id0)
  {
    SetSquareNeighborhood_6(id0);
  }

  private native int GetSquareNeighborhood_7();
  public int GetSquareNeighborhood()
  {
    return GetSquareNeighborhood_7();
  }

  private native void SquareNeighborhoodOn_8();
  public void SquareNeighborhoodOn()
  {
    SquareNeighborhoodOn_8();
  }

  private native void SquareNeighborhoodOff_9();
  public void SquareNeighborhoodOff()
  {
    SquareNeighborhoodOff_9();
  }

  private native void SetIslandValue_10(double id0);
  public void SetIslandValue(double id0)
  {
    SetIslandValue_10(id0);
  }

  private native double GetIslandValue_11();
  public double GetIslandValue()
  {
    return GetIslandValue_11();
  }

  private native void SetReplaceValue_12(double id0);
  public void SetReplaceValue(double id0)
  {
    SetReplaceValue_12(id0);
  }

  private native double GetReplaceValue_13();
  public double GetReplaceValue()
  {
    return GetReplaceValue_13();
  }

  public vtkImageIslandRemoval2D() { super(); }

  public vtkImageIslandRemoval2D(long id) { super(id); }
  public native long   VTKInit();

}
